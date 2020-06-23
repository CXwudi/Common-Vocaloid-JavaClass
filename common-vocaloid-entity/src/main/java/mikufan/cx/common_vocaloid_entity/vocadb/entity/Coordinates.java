package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Coordinates {

  @JsonProperty
  private String formatted;

  @JsonProperty
  private int latitude;

  @JsonProperty
  private boolean hasValue;

  @JsonProperty
  private int longitude;

}