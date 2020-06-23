package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
public class Venue {

  @JsonProperty
  private String address;

  @JsonProperty
  private MutableList<NamesItem> names;

  @JsonProperty
  private String addressCountryCode;

  @JsonProperty
  private Coordinates coordinates;

  @JsonProperty
  private String name;

  @JsonProperty
  private String description;

  @JsonProperty
  private MutableList<WebLinksItem> webLinks;

  @JsonProperty
  private int id;

  @JsonProperty
  private int version;

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private MutableList<EventsItem> events;

  @JsonProperty
  private String status;

  @JsonProperty
  private boolean deleted;

}