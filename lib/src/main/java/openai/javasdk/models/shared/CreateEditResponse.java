package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateEditResponse {
    @JsonProperty("choices")
    public CreateEditResponseChoices[] choices;
    public CreateEditResponse withChoices(CreateEditResponseChoices[] choices) {
        this.choices = choices;
        return this;
    }
    
    @JsonProperty("created")
    public Long created;
    public CreateEditResponse withCreated(Long created) {
        this.created = created;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public CreateEditResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
    @JsonProperty("usage")
    public CreateEditResponseUsage usage;
    public CreateEditResponse withUsage(CreateEditResponseUsage usage) {
        this.usage = usage;
        return this;
    }
    
}
