package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class SongInListForApiContract {

  @JsonProperty
  private String notes;

  @JsonProperty
  private int order;

  @JsonProperty
  private SongForApiContract song;

}
