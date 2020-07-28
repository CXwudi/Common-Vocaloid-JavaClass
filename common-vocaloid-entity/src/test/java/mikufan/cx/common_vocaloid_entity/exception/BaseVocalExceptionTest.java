package mikufan.cx.common_vocaloid_entity.exception;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
class BaseVocalExceptionTest {
  private enum RCIExample implements VocalExceptionRCI{
    MIKU393901;
  }
  private static class DummyException extends BaseVocalException {

    public DummyException(VocalExceptionRCI rci, String message) {
      super(rci, message);
    }

    public DummyException(VocalExceptionRCI rci, String message, Throwable cause) {
      super(rci, message, cause);
    }
  }

  @Test
  void testToString(){
    var expMsg = "A dummy vocaloid exception thrown";
    var exp = new DummyException(RCIExample.MIKU393901, expMsg, new Exception("I love Miku"));
    log.error("DummyException in testToString()", exp);
    try {
      throw exp;
    } catch (BaseVocalException e){
      assertEquals(RCIExample.MIKU393901, e.getRci());
      assertEquals(expMsg, e.getOriginalMessage());
    }
  }
}