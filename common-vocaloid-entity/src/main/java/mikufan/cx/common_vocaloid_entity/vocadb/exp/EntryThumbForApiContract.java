package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class EntryThumbForApiContract {

  @JsonProperty
  private String mime;

  @JsonProperty
  private String urlOriginal;

  @JsonProperty
  private String urlSmallThumb;

  @JsonProperty
  private String urlThumb;

  @JsonProperty
  private String urlTinyThumb;

}
