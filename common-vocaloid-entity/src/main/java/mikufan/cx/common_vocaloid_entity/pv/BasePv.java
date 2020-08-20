package mikufan.cx.common_vocaloid_entity.pv;

import lombok.*;

@Getter @ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public abstract class BasePv {
  private String pvId;
  private String service;
}
