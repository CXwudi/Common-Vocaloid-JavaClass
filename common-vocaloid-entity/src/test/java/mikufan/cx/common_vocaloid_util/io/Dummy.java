package mikufan.cx.common_vocaloid_util.io;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Dummy {

  @JsonProperty
  private String name;

  @JsonProperty
  private int id;

  @Override
  public String toString() {
    return
        "Dummy{" +
            "name = '" + name + '\'' +
            ",id = '" + id + '\'' +
            "}";
  }
}
