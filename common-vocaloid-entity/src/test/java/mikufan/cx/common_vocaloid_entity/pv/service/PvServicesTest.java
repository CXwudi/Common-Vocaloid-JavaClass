package mikufan.cx.common_vocaloid_entity.pv.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class PvServicesTest {

  @Test
  void contains() {
    assertTrue(PvServices.contains("NicoNicoDouga"));
  }

  @Test
  void getServices() {
    var services = PvServices.getServices();
    log.debug("services = {}", services);
    assertEquals(PvServiceStr.class.getDeclaredFields().length, services.size());
  }
}