package mikufan.cx.common_vocaloid_entity.pv;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Comparator;

/**
 * indicating something went wrong when performing task on a pv
 * @author CX无敌
 */
@Getter @ToString @EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class FailedVocaDbPv implements Comparable<FailedVocaDbPv> {

  @JsonProperty
  private VocaDbPv pv;

  @JsonProperty
  private String songName;

  @JsonProperty
  @EqualsAndHashCode.Exclude
  private String reason;

  @Override
  public int compareTo(FailedVocaDbPv o) {
    return Comparator.nullsFirst(Comparator.comparing(FailedVocaDbPv::getPv)).compare(this, o);
  }
}
