package mikufan.cx.common_vocaloid_util.io;

import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import mikufan.cx.common_vocaloid_util.jackson.YamlMapperUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class JacksonPojoTranslatorTest {
  private final JacksonPojoTransformer<Dummy> dummyTranslator = new JacksonPojoTransformer<>(JsonMapper.builder().build(), Dummy.class);
  private final Path dir = Path.of("src/test/resources/io_test");
  private final Path dummyJson = dir.resolve("dummy.json");
  private final Path missingFile = dir.resolve("missing.json");

  private final Dummy dummyObj = new Dummy("CX", 22);

  /**
   * should be able to read from json
   */
  @Test @SneakyThrows
  void testRead() {
    var dummy = dummyTranslator.read(dummyJson);
    assertNotNull(dummy);
    log.info("dummy = {}", dummy);
  }

  /**
   * should not break if IOException happens
   */
  @Test
  void testReadMissingFile() {
    assertThrows(IOException.class, () -> dummyTranslator.read(missingFile));
  }

  /**
   * should be able to write an obj to json file
   */
  @Test @SneakyThrows
  void testWrite(){
    var tempFile = dir.resolve("temp.json");
    tempFile.toFile().deleteOnExit();
    assertTrue(dummyTranslator.write(dummyObj, tempFile));
  }

  /**
   * should be able to overwrite the json file with an obj
   */
  @Test @SneakyThrows
  void testOverWrite(){
    var tempFile = dir.resolve("temp.json");
    if (Files.notExists(tempFile) && !tempFile.toFile().createNewFile()){ //make sure a file exists
      fail();
    }
    tempFile.toFile().deleteOnExit();
    assertTrue(dummyTranslator.write(dummyObj, tempFile));
  }

  @Test @SneakyThrows
  void testReadYaml(){
    var dummyYaml = dir.resolve("dummyYaml.yaml");
    var reader = new JacksonPojoTransformer(YamlMapperUtil.createDefaultForReadOnly(), Dummy.class);
    var yamlOpt = reader.read(dummyYaml);
    log.info("yamlOpt = {}", yamlOpt);
    assertTrue(true);
  }
}