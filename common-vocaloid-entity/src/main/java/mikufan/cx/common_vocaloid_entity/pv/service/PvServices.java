package mikufan.cx.common_vocaloid_entity.pv.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.api.set.ImmutableSet;

/**
 * contains utils functions for {@link PvServiceStr} <p>
 * this class is not in common-util for preventing circular maven deps
 * @author CX无敌
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PvServices {
  /**
   * contains all the declared pv services in {@link PvServiceStr}
   */
  private static final ImmutableList<String> ALL_SERVICES;

  /**
   * just a set version of {@link PvServices#ALL_SERVICES}
   */
  private static final ImmutableSet<String> ALL_SERVICES_SET;

  static {
    // reflection
    var fields = PvServiceStr.class.getDeclaredFields();

    ALL_SERVICES = Lists.immutable.of(fields).collect(field -> {
      try {
        return (String) field.get(null);
      } catch (IllegalAccessException e) {
        e.printStackTrace();
        return null;
      }
    });


    ALL_SERVICES_SET = ALL_SERVICES.toSet().toImmutable();
  }

  /**
   * check if a given service name is known
   */
  public static boolean contains(String serviceName){
    return ALL_SERVICES_SET.contains(serviceName);
  }

  /**
   * get a list of service <P>
   * this is also the default order for all services
   * @return
   */
  public static ImmutableList<String> getServices(){
    return ALL_SERVICES;
  }

}
