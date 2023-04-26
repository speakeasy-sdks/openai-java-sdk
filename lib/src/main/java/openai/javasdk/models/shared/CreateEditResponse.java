/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateEditResponse - OK
 */
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
    
    public CreateEditResponse(@JsonProperty("choices") CreateEditResponseChoices[] choices, @JsonProperty("created") Long created, @JsonProperty("object") String object, @JsonProperty("usage") CreateEditResponseUsage usage) {
        this.choices = choices;
        this.created = created;
        this.object = object;
        this.usage = usage;
  }
}
