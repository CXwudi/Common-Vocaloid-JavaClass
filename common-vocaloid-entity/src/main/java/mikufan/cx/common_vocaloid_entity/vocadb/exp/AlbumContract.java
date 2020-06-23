package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class AlbumContract {

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String artistString;

  @JsonProperty
  private String coverPictureMime;

  @JsonProperty
  private String createDate;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private String discType;

  @JsonProperty
  private int id;

  @JsonProperty
  private String name;

  @JsonProperty
  private double ratingAverage;

  @JsonProperty
  private int ratingCount;

  @JsonProperty
  private OptionalDateTimeContract releaseDate;

  @JsonProperty
  private ReleaseEventForApiContract releaseEvent;

  @JsonProperty
  private String status;

  @JsonProperty
  private int version;

}
