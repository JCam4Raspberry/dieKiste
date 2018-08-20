
package ch.diekiste.model.signalk.version.v1.file.update;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ttyUSB0"
})
public class Sources {

    @JsonProperty("ttyUSB0")
    private TtyUSB0 ttyUSB0;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ttyUSB0")
    public TtyUSB0 getTtyUSB0() {
        return ttyUSB0;
    }

    @JsonProperty("ttyUSB0")
    public void setTtyUSB0(TtyUSB0 ttyUSB0) {
        this.ttyUSB0 = ttyUSB0;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
