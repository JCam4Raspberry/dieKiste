
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
    "talker",
    "sentences"
})
public class GP {

    @JsonProperty("talker")
    private String talker;
    @JsonProperty("sentences")
    private Sentences sentences;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("talker")
    public String getTalker() {
        return talker;
    }

    @JsonProperty("talker")
    public void setTalker(String talker) {
        this.talker = talker;
    }

    @JsonProperty("sentences")
    public Sentences getSentences() {
        return sentences;
    }

    @JsonProperty("sentences")
    public void setSentences(Sentences sentences) {
        this.sentences = sentences;
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
