package mikufan.cx.common_vocaloid_entity.vocadb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @ToString
public class ItemsItem implements Comparable<ItemsItem> {

  @JsonProperty
  private Song song;

  @JsonProperty
  private String notes;

  /**
   * need setter for merging 2 response song list
   */
  @Setter
  @JsonProperty
  private int order;

  @Override
  public int compareTo(ItemsItem o) {
    return this.order - o.order;
  }
}