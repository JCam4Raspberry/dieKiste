
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
    "speedOverGround",
    "position",
    "headingMagnetic"
})
public class Navigation {

    @JsonProperty("speedOverGround")
    private SpeedOverGround speedOverGround;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("headingMagnetic")
    private HeadingMagnetic headingMagnetic;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("speedOverGround")
    public SpeedOverGround getSpeedOverGround() {
        return speedOverGround;
    }

    @JsonProperty("speedOverGround")
    public void setSpeedOverGround(SpeedOverGround speedOverGround) {
        this.speedOverGround = speedOverGround;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    @JsonProperty("headingMagnetic")
    public HeadingMagnetic getHeadingMagnetic() {
        return headingMagnetic;
    }

    @JsonProperty("headingMagnetic")
    public void setHeadingMagnetic(HeadingMagnetic headingMagnetic) {
        this.headingMagnetic = headingMagnetic;
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
