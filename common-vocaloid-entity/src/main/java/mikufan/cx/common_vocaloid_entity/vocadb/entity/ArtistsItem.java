package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class ArtistsItem {

  @JsonProperty
  private Artist artist;

  @JsonProperty
  private boolean isSupport;

  @JsonProperty
  private boolean isCustomName;

  @JsonProperty
  private String roles;

  @JsonProperty
  private String name;

  @JsonProperty
  private String effectiveRoles;

  @JsonProperty
  private String categories;

  @JsonProperty
  private int id;

}