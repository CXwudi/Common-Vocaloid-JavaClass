package mikufan.cx.common_vocaloid_entity.vocadb.exp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class PVContract {

  @JsonProperty
  private String author;

  @JsonProperty
  private int createdBy;

  @JsonProperty
  private boolean disabled;

  @JsonProperty
  private PVExtendedMetadata extendedMetadata;

  @JsonProperty
  private int id;

  @JsonProperty
  private int length;

  @JsonProperty
  private String name;

  @JsonProperty
  private String publishDate;

  @JsonProperty
  private String pvId;

  @JsonProperty
  private String service;

  @JsonProperty
  private String pvType;

  @JsonProperty
  private String thumbUrl;

  @JsonProperty
  private String url;

}
