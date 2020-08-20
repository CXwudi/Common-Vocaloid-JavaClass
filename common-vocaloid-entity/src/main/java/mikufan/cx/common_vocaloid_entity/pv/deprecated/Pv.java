package mikufan.cx.common_vocaloid_entity.pv.deprecated;

import lombok.*;

import java.util.Objects;

/**
 * A simple representation of a pv
 * @author CX无敌
 */
@Getter @ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Pv extends AbstractPv{

  public Pv(@NonNull String pvId, @NonNull String service, String title) {
    this.pvId = pvId;
    this.service = service;
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Pv)) {
      return false;
    }
    AbstractPv that = (AbstractPv) o;
    return Objects.equals(service, that.service) && Objects.equals(pvId, that.pvId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, pvId);
  }
}
