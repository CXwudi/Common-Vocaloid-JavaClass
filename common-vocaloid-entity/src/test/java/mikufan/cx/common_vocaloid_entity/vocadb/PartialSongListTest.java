package mikufan.cx.common_vocaloid_entity.vocadb;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import mikufan.cx.common_vocaloid_entity.vocadb.api.songList.getListIdSongs.PartialSongList;
import mikufan.cx.common_vocaloid_entity.vocadb.api.songList.getListIdSongs.SongInListForApiContract;
import mikufan.cx.common_vocaloid_util.jackson.JsonMapperUtil;
import org.eclipse.collections.api.factory.Lists;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class PartialSongListTest {
  private final ObjectMapper objectMapper = JsonMapperUtil.createDefault();
  private final String parent = "src/test/resources/vocadb";


  /**
   * should parse the json model
   */
  @Test @SneakyThrows
  void testParseModel() {
    var jsonFile = new File(parent, "songListModelSchema.json");
    var response = objectMapper.readValue(jsonFile, PartialSongList.class);
    log.info("{}", response);
    assertTrue(true);
  }

  /**
   * should be able to parse the response with full details
   */
  @Test
  void testParseSampleResponse() {
    var samples = Lists.immutable.of(
        "songListFullResponseSample1.json",
        "songListFullResponseSample2.json"
    );
    samples.forEach(json -> {
      var jsonFile = new File(parent, json);
      PartialSongList response = null;
      try {
        response = objectMapper.readValue(jsonFile, PartialSongList.class);
      } catch (IOException e) {
        fail(e);
      }
      log.info("{}", response);
      assertNotNull(response);
    });
  }

  /**
   * should be able to merge two responses into one without duplicating songs
   */
  @Test @SneakyThrows
  void testEqualsAndHashCode(){
    var responses = Lists.immutable.of(
        "songListFullResponseSample1.json",
        "songListFullResponseSample2.json"
    ).collect(str -> {
      var file = new File(parent, str);
      PartialSongList response = null;
      try {
        response = objectMapper.readValue(file, PartialSongList.class);
      } catch (IOException e) {
        fail(e);
      }
      assertNotNull(response);
      return response;
    });

    var mergedResponse = responses.drop(1).injectInto(
        responses.get(0),
        (res1, res2) ->{
          var set1 = res1.getItems().distinctBy(item -> item.getSong().getId());
          var set2 = res2.getItems().distinctBy(item -> item.getSong().getId());
          set1.addAll(set2);
          var finalSet = set1.distinctBy(item -> item.getSong().getId())
              .sortThisByInt(item -> item.getOrder())//sorted by order
              .zipWithIndex().collect(itemWithIndex -> {
                var oriItem = itemWithIndex.getOne();
                var newIndex = itemWithIndex.getTwo() + 1;//remember vocadb list order start from 1
                return SongInListForApiContract.builder()
                    .notes(oriItem.getNotes())
                    .song(oriItem.getSong())
                    .order(newIndex)
                    .build();
              });

          res1.getItems().clear();
          res1.getItems().addAll(finalSet);
          return res1;
        });

    log.info("{}", objectMapper.writeValueAsString(mergedResponse));
    assertEquals(8, mergedResponse.getItems().size());

  }

  @Test @SneakyThrows
  void testWriteBackToFile(){
    var jsonFile = new File(parent, "songListModelSchema.json");
    var response = objectMapper.readValue(jsonFile, PartialSongList.class);
    objectMapper.enable(SerializationFeature.INDENT_OUTPUT).enable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    var resultFile = new File(parent, "songListModelSchemaRewritten.json");
    resultFile.deleteOnExit();
    objectMapper.writeValue(resultFile, response);
    assertTrue(true);
  }


}