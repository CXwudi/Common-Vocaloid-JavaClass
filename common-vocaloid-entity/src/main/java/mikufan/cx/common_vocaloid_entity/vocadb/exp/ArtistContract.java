package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class ArtistContract {

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String artistType;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private int id;

  @JsonProperty
  private String name;

  @JsonProperty
  private String pictureMime;

  @JsonProperty
  private String releaseDate;

  @JsonProperty
  private String status;

  @JsonProperty
  private int version;

}
