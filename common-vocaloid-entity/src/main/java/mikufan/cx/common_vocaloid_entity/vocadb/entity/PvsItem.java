package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class PvsItem {

  @JsonProperty
  private String pvType;

  @JsonProperty
  private String author;

  @JsonProperty
  private int length;

  @JsonProperty
  private String publishDate;

  @JsonProperty
  private String url;

  @JsonProperty
  private int createdBy;

  @JsonProperty
  private String pvId;

  @JsonProperty
  private String service;

  @JsonProperty
  private ExtendedMetadata extendedMetadata;

  @JsonProperty
  private String name;

  @JsonProperty
  private boolean disabled;

  @JsonProperty
  private int id;

  @JsonProperty
  private String thumbUrl;

}