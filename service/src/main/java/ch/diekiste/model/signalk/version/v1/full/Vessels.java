
package ch.diekiste.model.signalk.version.v1.full;

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
    "urn:mrn:signalk:uuid:705f5f1a-efaf-44aa-9cb8-a0fd6305567c"
})
public class Vessels {

    @JsonProperty("urn:mrn:signalk:uuid:705f5f1a-efaf-44aa-9cb8-a0fd6305567c")
    private UrnMrnSignalkUuid705f5f1aEfaf44aa9cb8A0fd6305567c urnMrnSignalkUuid705f5f1aEfaf44aa9cb8A0fd6305567c;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("urn:mrn:signalk:uuid:705f5f1a-efaf-44aa-9cb8-a0fd6305567c")
    public UrnMrnSignalkUuid705f5f1aEfaf44aa9cb8A0fd6305567c getUrnMrnSignalkUuid705f5f1aEfaf44aa9cb8A0fd6305567c() {
        return urnMrnSignalkUuid705f5f1aEfaf44aa9cb8A0fd6305567c;
    }

    @JsonProperty("urn:mrn:signalk:uuid:705f5f1a-efaf-44aa-9cb8-a0fd6305567c")
    public void setUrnMrnSignalkUuid705f5f1aEfaf44aa9cb8A0fd6305567c(UrnMrnSignalkUuid705f5f1aEfaf44aa9cb8A0fd6305567c urnMrnSignalkUuid705f5f1aEfaf44aa9cb8A0fd6305567c) {
        this.urnMrnSignalkUuid705f5f1aEfaf44aa9cb8A0fd6305567c = urnMrnSignalkUuid705f5f1aEfaf44aa9cb8A0fd6305567c;
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
