package mikufan.cx.common_vocaloid_entity.task;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import mikufan.cx.common_vocaloid_entity.pv.FailedVocaDbPv;
import mikufan.cx.common_vocaloid_entity.pv.VocaDbPv;
import org.eclipse.collections.api.factory.SortedSets;
import org.eclipse.collections.api.set.sorted.MutableSortedSet;

import java.util.Comparator;

/**
 * a task for manipulating around PVs with VocaDB IDs.
 * @author CX无敌
 */
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class VocaDbPvTask implements Task<VocaDbPv> {
  //we use <P extends AbstractPv> to allow either storing generic AbstractPv or just one subtype of AbstractPv

  @Getter @NonNull
  @JsonProperty("folderName")
  protected String folderName;

  @JsonProperty("todo")
  protected MutableSortedSet<VocaDbPv> todo = SortedSets.mutable.empty();

  @JsonProperty("done")
  protected MutableSortedSet<VocaDbPv> done = SortedSets.mutable.empty();

  @JsonProperty("fail")
  protected MutableSortedSet<FailedVocaDbPv> fails = SortedSets.mutable.empty();


  @Override
  @JsonIgnore
  public MutableSortedSet<VocaDbPv> getTodo() {
    return todo;
  }

  @Override
  @JsonIgnore
  public MutableSortedSet<VocaDbPv> getDone() {
    return done;
  }

  @JsonIgnore
  public MutableSortedSet<FailedVocaDbPv> getFails() {
    return fails;
  }

  /**
   * add the vocaDbPv to done list, remove it from other lists if presents
   * @return {@code true} if vocaDbPv added
   */
  public boolean markDone(@NonNull VocaDbPv vocaDbPv){
    todo.remove(vocaDbPv);
    fails.removeIf(failedVocaDbPv -> failedVocaDbPv.getPv().equals(vocaDbPv));
    return done.add(vocaDbPv);
  }

  /**
   * add the vocaDbPv to tudo list, remove it from other lists if presents
   * @return {@code true} if vocaDbPv added
   */
  public boolean markTodo(@NonNull VocaDbPv vocaDbPv){
    done.remove(vocaDbPv);
    fails.removeIf(failedVocaDbPv -> failedVocaDbPv.getPv().equals(vocaDbPv));
    return todo.add(vocaDbPv);
  }

  /**
   * add the vocaDbPv to error list, remove it from other lists if presents
   * @return {@code true} if vocaDbPv added
   */
  public boolean markError(@NonNull VocaDbPv vocaDbPv, String reason){
    done.remove(vocaDbPv);
    todo.remove(vocaDbPv);
    return fails.add(new FailedVocaDbPv(vocaDbPv, vocaDbPv.getTitle(), reason));
  }

  /**
   * add the song to error list, without the pv info
   * @return {@code true} if song is added to the error list
   */
  public boolean markError(@NonNull String songName, String reason){
    return fails.add(new FailedVocaDbPv(null, songName, reason));
  }
}
