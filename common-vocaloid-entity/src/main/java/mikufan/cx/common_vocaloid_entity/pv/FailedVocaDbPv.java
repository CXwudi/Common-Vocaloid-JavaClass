package mikufan.cx.common_vocaloid_entity.pv;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import mikufan.cx.common_vocaloid_entity.label.FailedObject;

import java.util.Comparator;
import java.util.function.Function;

/**
 * indicating something went wrong when performing task on a pv
 * @author CX无敌
 */
@Getter @ToString @EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FailedVocaDbPv extends FailedObject<VocaDbPv> implements Comparable<FailedVocaDbPv> {

  @JsonProperty
  private String songName;

  public FailedVocaDbPv(VocaDbPv pv, String songName, String reason){
    super(pv, reason);
    this.songName = songName;
  }

  @Override
  public int compareTo(FailedVocaDbPv o) {
    return Comparator.nullsFirst(
        // null first on failed pv instances
        (FailedVocaDbPv f1, FailedVocaDbPv f2) ->
            // null first on vocadb pv instances
            Comparator.<VocaDbPv>nullsFirst(Comparator.naturalOrder()).compare(f1.getFailedObj(), f2.getFailedObj())
    ).compare(this, o);
  }
}
