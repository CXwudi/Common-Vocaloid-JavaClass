package mikufan.cx.common_vocaloid_entity.label;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * indicating several files belong to one song
 * @author CX无敌
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString @EqualsAndHashCode
@Builder
public class VSongResources {

  @JsonProperty
  private String video;

  @JsonProperty
  private String audio;

  @JsonProperty
  private String thumbnail;

  @JsonProperty
  private String vocadbInfo;
}
