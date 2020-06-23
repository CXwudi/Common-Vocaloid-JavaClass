package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class TagBaseContract {

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String categoryName;

  @JsonProperty
  private int id;

  @JsonProperty
  private String name;

  @JsonProperty
  private String urlSlug;

}
