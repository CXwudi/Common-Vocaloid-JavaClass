package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class ArtistForSongContract {

  @JsonProperty
  private ArtistContract artist;

  @JsonProperty
  private String categories;

  @JsonProperty
  private String effectiveRoles;

  @JsonProperty
  private int id;

  @JsonProperty
  private boolean isCustomName;

  @JsonProperty
  private boolean isSupport;

  @JsonProperty
  private String name;

  @JsonProperty
  private String roles;

}
