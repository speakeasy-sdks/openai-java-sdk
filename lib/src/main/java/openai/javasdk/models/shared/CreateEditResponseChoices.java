package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateEditResponseChoices {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("finish_reason")
    public String finishReason;
    public CreateEditResponseChoices withFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public Long index;
    public CreateEditResponseChoices withIndex(Long index) {
        this.index = index;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logprobs")
    public CreateEditResponseChoicesLogprobs logprobs;
    public CreateEditResponseChoices withLogprobs(CreateEditResponseChoicesLogprobs logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    public String text;
    public CreateEditResponseChoices withText(String text) {
        this.text = text;
        return this;
    }
    
}
