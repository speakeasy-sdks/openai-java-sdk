package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateChatCompletionResponse {
    @JsonProperty("choices")
    public CreateChatCompletionResponseChoices[] choices;
    public CreateChatCompletionResponse withChoices(CreateChatCompletionResponseChoices[] choices) {
        this.choices = choices;
        return this;
    }
    
    @JsonProperty("created")
    public Long created;
    public CreateChatCompletionResponse withCreated(Long created) {
        this.created = created;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public CreateChatCompletionResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("model")
    public String model;
    public CreateChatCompletionResponse withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public CreateChatCompletionResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("usage")
    public CreateChatCompletionResponseUsage usage;
    public CreateChatCompletionResponse withUsage(CreateChatCompletionResponseUsage usage) {
        this.usage = usage;
        return this;
    }
    
}
