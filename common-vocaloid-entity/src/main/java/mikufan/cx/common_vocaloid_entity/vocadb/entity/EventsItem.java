package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class EventsItem {

  @JsonProperty
  private String date;

  @JsonProperty
  private String urlSlug;

  @JsonProperty
  private Venue venue;

  @JsonProperty
  private String endDate;

  @JsonProperty
  private boolean hasVenueOrVenueName;

  @JsonProperty
  private String description;

  @JsonProperty
  private boolean customName;

  @JsonProperty
  private SongList songList;

  @JsonProperty
  private int version;

  @JsonProperty
  private String pictureMime;

  @JsonProperty
  private String venueName;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private Series series;

  @JsonProperty
  private String name;

  @JsonProperty
  private int id;

  @JsonProperty
  private String category;

  @JsonProperty
  private String inheritedCategory;

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String status;

}