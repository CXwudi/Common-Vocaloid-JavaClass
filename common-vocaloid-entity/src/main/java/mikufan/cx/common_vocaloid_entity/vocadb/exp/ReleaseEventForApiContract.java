package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class ReleaseEventForApiContract {

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private MutableList<ArtistForEventContract> artists;

  @JsonProperty
  private String category;

  @JsonProperty
  private String date;

  @JsonProperty
  private String description;

  @JsonProperty
  private String endDate;

  @JsonProperty
  private int id;

  @JsonProperty
  private EntryThumbForApiContract mainPicture;

  @JsonProperty
  private String name;

  @JsonProperty
  private MutableList<LocalizedStringContract> names;

  @JsonProperty
  private ReleaseEventSeriesContract series;

  @JsonProperty
  private int seriesId;

  @JsonProperty
  private int seriesNumber;

  @JsonProperty
  private String seriesSuffix;

  @JsonProperty
  private SongListBaseContract songList;

  @JsonProperty
  private String status;

  @JsonProperty
  private MutableList<TagUsageForApiContract> tags;

  @JsonProperty
  private String urlSlug;

  @JsonProperty
  private VenueForApiContract venue;

  @JsonProperty
  private String venueName;

  @JsonProperty
  private int version;

  @JsonProperty
  private MutableList<WebLinkForApiContract> webLinks;

}
