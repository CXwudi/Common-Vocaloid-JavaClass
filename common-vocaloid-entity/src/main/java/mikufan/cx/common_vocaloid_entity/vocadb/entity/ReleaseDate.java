package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class ReleaseDate {

  @JsonProperty
  private int month;

  @JsonProperty
  private int year;

  @JsonProperty
  private String formatted;

  @JsonProperty
  private boolean isEmpty;

  @JsonProperty
  private int day;

}