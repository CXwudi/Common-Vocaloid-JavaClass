package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class NamesItem {

  @JsonProperty
  private String language;

  @JsonProperty
  private String value;

}