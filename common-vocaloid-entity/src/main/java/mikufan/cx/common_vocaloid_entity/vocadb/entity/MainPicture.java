package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class MainPicture {

  @JsonProperty
  private String urlOriginal;

  @JsonProperty
  private String urlSmallThumb;

  @JsonProperty
  private String mime;

  @JsonProperty
  private String urlThumb;

  @JsonProperty
  private String urlTinyThumb;

}