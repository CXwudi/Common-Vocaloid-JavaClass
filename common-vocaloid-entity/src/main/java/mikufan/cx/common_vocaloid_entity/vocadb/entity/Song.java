package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class Song {

  @JsonProperty
  private MutableList<Album> albums;

  @JsonProperty
  private String publishDate;

  @JsonProperty
  private MainPicture mainPicture;

  /**
   * artist string can contain "various" to hide long artists lists <p>
   * given a setter for replacing "various"
   */
  @JsonProperty
  @Setter
  private String artistString;

  @JsonProperty
  private int ratingScore;

  @JsonProperty
  private MutableList<ArtistsItem> artists;

  @JsonProperty
  private MutableList<WebLinksItem> webLinks;

  @JsonProperty
  private int id;

  @JsonProperty
  private String thumbUrl;

  @JsonProperty
  private String defaultName;

  @JsonProperty
  private MutableList<LyricsItem> lyrics;

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String createDate;

  @JsonProperty
  private int mergedTo;

  @JsonProperty
  private int originalVersionId;

  @JsonProperty
  private String defaultNameLanguage;

  @JsonProperty
  private int lengthSeconds;

  @JsonProperty
  private MutableList<PvsItem> pvs;

  @JsonProperty
  private String songType;

  @JsonProperty
  private int version;

  @JsonProperty
  private MutableList<TagsItem> tags;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private MutableList<NamesItem> names;

  @JsonProperty
  private int favoritedTimes;

  @JsonProperty
  private String name;

  @JsonProperty
  private String pvServices;

  @JsonProperty
  private ReleaseEvent releaseEvent;

  @JsonProperty
  private String status;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Song song = (Song) o;
    return id == song.id;
  }

  @Override
  public int hashCode() {
    return id;
  }
}