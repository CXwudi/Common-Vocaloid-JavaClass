package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class SongList {

  @JsonProperty
  private String name;

  @JsonProperty
  private int id;

  @JsonProperty
  private String featuredCategory;

}