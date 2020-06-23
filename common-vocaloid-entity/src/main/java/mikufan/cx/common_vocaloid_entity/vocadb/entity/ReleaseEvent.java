package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class ReleaseEvent {

  @JsonProperty
  private String date;

  @JsonProperty
  private String urlSlug;

  @JsonProperty
  private Venue venue;

  @JsonProperty
  private String endDate;

  @JsonProperty
  private String description;

  @JsonProperty
  private MainPicture mainPicture;

  @JsonProperty
  private SongList songList;

  @JsonProperty
  private int version;

  @JsonProperty
  private int seriesId;

  @JsonProperty
  private int seriesNumber;

  @JsonProperty
  private MutableList<TagsItem> tags;

  @JsonProperty
  private String venueName;

  @JsonProperty
  private MutableList<NamesItem> names;

  @JsonProperty
  private MutableList<ArtistsItem> artists;

  @JsonProperty
  private Series series;

  @JsonProperty
  private String name;

  @JsonProperty
  private MutableList<WebLinksItem> webLinks;

  @JsonProperty
  private int id;

  @JsonProperty
  private String seriesSuffix;

  @JsonProperty
  private String category;

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String status;

}