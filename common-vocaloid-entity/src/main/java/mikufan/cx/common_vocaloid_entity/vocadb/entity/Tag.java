package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Tag {

  @JsonProperty
  private String urlSlug;

  @JsonProperty
  private String name;

  @JsonProperty
  private int id;

  @JsonProperty
  private String categoryName;

  @JsonProperty
  private String additionalNames;

}