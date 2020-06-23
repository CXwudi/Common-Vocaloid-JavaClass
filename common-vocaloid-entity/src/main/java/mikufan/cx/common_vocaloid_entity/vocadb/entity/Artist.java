package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Artist {

  @JsonProperty
  private String pictureMime;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private String releaseDate;

  @JsonProperty
  private String name;

  @JsonProperty
  private String artistType;

  @JsonProperty
  private int id;

  @JsonProperty
  private int version;

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String status;

}