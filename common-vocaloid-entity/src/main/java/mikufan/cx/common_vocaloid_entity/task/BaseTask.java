package mikufan.cx.common_vocaloid_entity.task;

import lombok.*;

import java.util.Set;

/**
 * A generic task, it contains a list of task to performance and a lost of task that is done
 *
 * @param <T> the object that the task is about
 * @author CX无敌
 */
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter @ToString
public abstract class BaseTask<T> {

  /**
   * tasks that need to be performed
   */
  protected Set<T> todo;

  /**
   * tasks that are done
   */
  protected Set<T> done;


}
