package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class Series {

  @JsonProperty
  private String pictureMime;

  @JsonProperty
  private String urlSlug;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private String name;

  @JsonProperty
  private String description;

  @JsonProperty
  private MutableList<WebLinksItem> webLinks;

  @JsonProperty
  private int id;

  @JsonProperty
  private String category;

  @JsonProperty
  private int version;

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String status;

}