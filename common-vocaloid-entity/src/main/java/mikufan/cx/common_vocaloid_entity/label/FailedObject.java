package mikufan.cx.common_vocaloid_entity.label;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public abstract class FailedObject<T> {

  @JsonProperty
  protected T failedObj;

  @JsonProperty
  @EqualsAndHashCode.Exclude
  protected String reason;
}
