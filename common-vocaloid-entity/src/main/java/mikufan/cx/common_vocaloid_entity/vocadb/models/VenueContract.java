// auto-generated by get-my-vocadb-java-model at 2020-06-23T13:06:28.240967700
package mikufan.cx.common_vocaloid_entity.vocadb.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VenueContract {

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String address;

  @JsonProperty
  private String addressCountryCode;

  @JsonProperty
  private OptionalGeoPointContract coordinates;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private String description;

  @JsonProperty
  private int id;

  @JsonProperty
  private String name;

  @JsonProperty
  private String status;

  @JsonProperty
  private int version;

  @JsonProperty
  private MutableList<WebLinkContract> webLinks;

}