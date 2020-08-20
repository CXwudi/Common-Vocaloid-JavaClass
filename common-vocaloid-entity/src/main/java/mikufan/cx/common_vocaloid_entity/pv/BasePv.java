package mikufan.cx.common_vocaloid_entity.pv;

import lombok.*;

/**
 * a simple class for representing a PV, either in Niconico or youtube or bilibili or others. <p>
 * user should extend this class to add their own features.
 * @author CX无敌
 */
@Getter @ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public abstract class BasePv {
  protected String pvId;
  protected String service;
}
