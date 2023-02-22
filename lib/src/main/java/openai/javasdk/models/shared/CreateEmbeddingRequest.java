package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateEmbeddingRequest {
    @JsonProperty("input")
    public Object input;
    public CreateEmbeddingRequest withInput(Object input) {
        this.input = input;
        return this;
    }
    
    @JsonProperty("model")
    public Object model;
    public CreateEmbeddingRequest withModel(Object model) {
        this.model = model;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public Object user;
    public CreateEmbeddingRequest withUser(Object user) {
        this.user = user;
        return this;
    }
    
}
