package mikufan.cx.common_vocaloid_entity.pv;

import mikufan.cx.common_vocaloid_entity.pv.service.PvServiceStr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailedVocaDbPvTest {

  @Test
  void testEquals() {
    VocaDbPv vocaDbPv = new VocaDbPv("sm123456", PvServiceStr.NICONICO, "A random しゃべる帽子 PV", 123456);
    FailedVocaDbPv pv1 = new FailedVocaDbPv(vocaDbPv, vocaDbPv.getTitle(), "deleted vocaDbPv");
    FailedVocaDbPv pv2 = new FailedVocaDbPv(vocaDbPv, vocaDbPv.getTitle(), "hided vocaDbPv");
    assertEquals(pv1,pv2);
  }

  /**
   * should not throw when sorting null
   */
  @Test
  void testCompareNotThrow(){
    VocaDbPv vocaDbPv = new VocaDbPv("sm123456", PvServiceStr.NICONICO, "A random しゃべる帽子 PV", 123456);
    FailedVocaDbPv pv1 = new FailedVocaDbPv(vocaDbPv, vocaDbPv.getTitle(), "deleted vocaDbPv");
    assertDoesNotThrow(() -> pv1.compareTo(null));
    assertTrue(pv1.compareTo(null) > 0);
  }


  /**
   * should not throw when sorting failed pv without pv
   */
  @Test
  void testCompareNotThrowOnNullPvs(){
    VocaDbPv vocaDbPv = new VocaDbPv("sm123456", PvServiceStr.NICONICO, "A random しゃべる帽子 PV", 123456);
    FailedVocaDbPv pv1 = new FailedVocaDbPv(vocaDbPv, vocaDbPv.getTitle(), "deleted vocaDbPv");
    FailedVocaDbPv pv2 = new FailedVocaDbPv(null, "Song title", "no PV");
    assertDoesNotThrow(() -> pv1.compareTo(pv2));
    assertDoesNotThrow(() -> pv2.compareTo(pv1));
    assertTrue(pv1.compareTo(pv2) > 0);
  }
}