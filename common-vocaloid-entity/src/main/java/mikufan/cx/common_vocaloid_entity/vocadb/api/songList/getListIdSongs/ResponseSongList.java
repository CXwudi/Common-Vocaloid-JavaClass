package mikufan.cx.common_vocaloid_entity.vocadb.api.songList.getListIdSongs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import mikufan.cx.common_vocaloid_entity.vocadb.entity.ItemsItem;
import org.eclipse.collections.api.list.MutableList;

/**
 * response object stored for GET /api/songLists/{listId}/songs
 *
 * @author CX无敌
 */
@Getter @ToString
public class ResponseSongList {

  @JsonProperty
  private String term;

  @Setter
  @JsonProperty
  private int totalCount;

  @JsonProperty
  private MutableList<ItemsItem> items;

}