package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class OptionalDateTimeContract {

  @JsonProperty
  private int day;

  @JsonProperty
  private String formatted;

  @JsonProperty
  private boolean isEmpty;

  @JsonProperty
  private int month;

  @JsonProperty
  private int year;

}
