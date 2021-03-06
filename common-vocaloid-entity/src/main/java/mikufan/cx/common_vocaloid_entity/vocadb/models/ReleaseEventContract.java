// auto-generated by get-my-vocadb-java-model at 2020-06-24T21:05:23.302211
package mikufan.cx.common_vocaloid_entity.vocadb.models;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter(onMethod_ = {@JsonIgnore}) @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReleaseEventContract {

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String category;

  @JsonProperty
  private boolean customName;

  @JsonProperty
  private String date;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private String description;

  @JsonProperty
  private String endDate;

  @JsonProperty
  private boolean hasVenueOrVenueName;

  @JsonProperty
  private int id;

  @JsonProperty
  private String inheritedCategory;

  @JsonProperty
  private String name;

  @JsonProperty
  private String pictureMime;

  @JsonProperty
  private ReleaseEventSeriesContract series;

  @JsonProperty
  private SongListBaseContract songList;

  @JsonProperty
  private String status;

  @JsonProperty
  private String urlSlug;

  @JsonProperty
  private VenueContract venue;

  @JsonProperty
  private String venueName;

  @JsonProperty
  private int version;

}
