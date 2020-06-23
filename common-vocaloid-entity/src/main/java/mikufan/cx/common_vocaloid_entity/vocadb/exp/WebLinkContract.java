package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class WebLinkContract {

  @JsonProperty
  private String category;

  @JsonProperty
  private String description;

  @JsonProperty
  private String descriptionOrUrl;

  @JsonProperty
  private int id;

  @JsonProperty
  private String url;

}
