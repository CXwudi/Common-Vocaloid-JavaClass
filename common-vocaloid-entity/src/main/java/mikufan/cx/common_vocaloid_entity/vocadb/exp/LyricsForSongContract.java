package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class LyricsForSongContract {

  @JsonProperty
  private String cultureCode;

  @JsonProperty
  private int id;

  @JsonProperty
  private String source;

  @JsonProperty
  private String translationType;

  @JsonProperty
  private String url;

  @JsonProperty
  private String value;

}
