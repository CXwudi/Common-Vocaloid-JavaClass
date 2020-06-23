package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class LyricsItem {

  @JsonProperty
  private String cultureCode;

  @JsonProperty
  private int id;

  @JsonProperty
  private String source;

  @JsonProperty
  private String translationType;

  @JsonProperty
  private String value;

  @JsonProperty
  private String url;

}