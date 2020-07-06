package mikufan.cx.common_vocaloid_entity.pv;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Comparator;
import java.util.function.Function;

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
    return Comparator.nullsFirst(
        // null first on failed pv instances
        (FailedVocaDbPv f1, FailedVocaDbPv f2) ->
            // null first on vocadb pv instances
            Comparator.<VocaDbPv>nullsFirst(Comparator.naturalOrder()).compare(f1.getPv(), f2.getPv())
    ).compare(this, o);
  }
}
