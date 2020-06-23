package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class SongForApiContract {

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private AlbumContract albums;

  @JsonProperty
  private ArtistForSongContract artists;

  @JsonProperty
  private String artistString;

  @JsonProperty
  private String createDate;

  @JsonProperty
  private String defaultName;

  @JsonProperty
  private String defaultNameLanguage;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private int favoritedTimes;

  @JsonProperty
  private int id;

  @JsonProperty
  private int lengthSeconds;

  @JsonProperty
  private LyricsForSongContract lyrics;

  @JsonProperty
  private EntryThumbForApiContract mainPicture;

  @JsonProperty
  private int mergedTo;

  @JsonProperty
  private String name;

  @JsonProperty
  private LocalizedStringContract names;

  @JsonProperty
  private int originalVersionId;

  @JsonProperty
  private String publishDate;

  @JsonProperty
  private PVContract pvs;

  @JsonProperty
  private String pvServices;

  @JsonProperty
  private int ratingScore;

  @JsonProperty
  private ReleaseEventForApiContract releaseEvent;

  @JsonProperty
  private String songType;

  @JsonProperty
  private String status;

  @JsonProperty
  private TagUsageForApiContract tags;

  @JsonProperty
  private String thumbUrl;

  @JsonProperty
  private int version;

  @JsonProperty
  private WebLinkForApiContract webLinks;

}
