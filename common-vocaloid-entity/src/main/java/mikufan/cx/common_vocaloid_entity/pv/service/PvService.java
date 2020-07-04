package mikufan.cx.common_vocaloid_entity.pv.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.factory.Maps;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.api.map.ImmutableMap;

import java.util.Objects;

/**
 * enum of pv service that vocaloid producer would usually used to submit their songs. <p>
 * the order declared is also the default order of pv service preference
 * @author CX无敌
 */
@AllArgsConstructor
@Getter
public enum PvService {

  /**
   * represents NicoNico Douga
   */
  @JsonProperty(PvServiceString.NICONICO_STR)
  NICONICO(PvServiceString.NICONICO_STR),

  /**
   * represents Youtube
   */
  @JsonProperty(PvServiceString.YOUTUBE_STR)
  YOUTUBE(PvServiceString.YOUTUBE_STR),

  /**
   * represents Bilibili
   */
  @JsonProperty(PvServiceString.BILIBILI_STR)
  BILIBILI(PvServiceString.BILIBILI_STR),

  /**
   * represents SoundCloud
   */
  @JsonProperty(PvServiceString.SOUNDCLOUD_STR)
  SOUNDCLOUD(PvServiceString.SOUNDCLOUD_STR),

  /**
   * represents Piapro
   */
  @JsonProperty(PvServiceString.PIAPRO_STR)
  PIAPRO(PvServiceString.PIAPRO_STR);

  private final String serviceName;

  /**
   * map to hold service name -> enum, construct at jvm startup
   */
  private static final ImmutableMap<String, PvService> NAME_TO_ENUM_MAP;
  /**
   * default order of preference
   */
  private static final ImmutableList<PvService> DEFAULT_ORDER;

  /**
   * we decide to use explicit implementation for default order and str->enum map
   */
  static {
    var map = Maps.mutable.<String, PvService>empty();
    map.put(PvServiceString.NICONICO_STR, NICONICO);
    map.put(PvServiceString.YOUTUBE_STR, YOUTUBE);
    map.put(PvServiceString.BILIBILI_STR, BILIBILI);
    map.put(PvServiceString.SOUNDCLOUD_STR, SOUNDCLOUD);
    map.put(PvServiceString.PIAPRO_STR, PIAPRO);
    NAME_TO_ENUM_MAP = map.toImmutable();

    DEFAULT_ORDER = Lists.immutable.of(
        NICONICO,
        YOUTUBE,
        BILIBILI,
        SOUNDCLOUD,
        PIAPRO
    );
  }

  /**
   * get the enum of pv service website base on service name. <p>
   * note: remember to call {@link PvService#contain(String)} before calling this method
   */
  public static PvService enumOf(String serviceName){
    return Objects.requireNonNull(NAME_TO_ENUM_MAP.get(serviceName), "Unknown pv website: " + serviceName);
  }

  public static boolean contain(String serviceName){
    return NAME_TO_ENUM_MAP.containsKey(serviceName);
  }

  public static ImmutableList<PvService> getDefaultOrder() {
    return DEFAULT_ORDER;
  }

}
