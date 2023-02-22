package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateModerationRequest {
    @JsonProperty("input")
    public Object input;
    public CreateModerationRequest withInput(Object input) {
        this.input = input;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model")
    public String model;
    public CreateModerationRequest withModel(String model) {
        this.model = model;
        return this;
    }
    
}
