package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Album {

  @JsonProperty
  private String coverPictureMime;

  @JsonProperty
  private ReleaseDate releaseDate;

  @JsonProperty
  private String artistString;

  @JsonProperty
  private int ratingCount;

  @JsonProperty
  private int version;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private String discType;

  @JsonProperty
  private String name;

  @JsonProperty
  private int id;

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private ReleaseEvent releaseEvent;

  @JsonProperty
  private String createDate;

  @JsonProperty
  private int ratingAverage;

  @JsonProperty
  private String status;

}