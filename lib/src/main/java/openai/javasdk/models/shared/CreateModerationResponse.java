package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateModerationResponse {
    @JsonProperty("id")
    public String id;
    public CreateModerationResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("model")
    public String model;
    public CreateModerationResponse withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonProperty("results")
    public CreateModerationResponseResults[] results;
    public CreateModerationResponse withResults(CreateModerationResponseResults[] results) {
        this.results = results;
        return this;
    }
    
}
