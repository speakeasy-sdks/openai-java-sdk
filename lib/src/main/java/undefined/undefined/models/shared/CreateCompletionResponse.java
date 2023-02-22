package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCompletionResponse {
    @JsonProperty("choices")
    public CreateCompletionResponseChoices[] choices;
    public CreateCompletionResponse withChoices(CreateCompletionResponseChoices[] choices) {
        this.choices = choices;
        return this;
    }
    
    @JsonProperty("created")
    public Long created;
    public CreateCompletionResponse withCreated(Long created) {
        this.created = created;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public CreateCompletionResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("model")
    public String model;
    public CreateCompletionResponse withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public CreateCompletionResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("usage")
    public CreateCompletionResponseUsage usage;
    public CreateCompletionResponse withUsage(CreateCompletionResponseUsage usage) {
        this.usage = usage;
        return this;
    }
    
}
