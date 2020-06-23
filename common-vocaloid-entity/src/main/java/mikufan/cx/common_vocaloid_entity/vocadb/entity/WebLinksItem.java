package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class WebLinksItem {

  @JsonProperty
  private String descriptionOrUrl;

  @JsonProperty
  private String description;

  @JsonProperty
  private int id;

  @JsonProperty
  private String category;

  @JsonProperty
  private String url;

}