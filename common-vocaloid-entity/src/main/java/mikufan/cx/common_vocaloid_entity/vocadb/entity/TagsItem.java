package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class TagsItem {

  @JsonProperty
  private int count;

  @JsonProperty
  private Tag tag;

}