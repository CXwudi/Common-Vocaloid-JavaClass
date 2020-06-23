package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class OptionalGeoPointContract {

  @JsonProperty
  private String formatted;

  @JsonProperty
  private boolean hasValue;

  @JsonProperty
  private double latitude;

  @JsonProperty
  private double longitude;

}
