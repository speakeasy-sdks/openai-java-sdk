package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCompletionResponseChoices {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("finish_reason")
    public String finishReason;
    public CreateCompletionResponseChoices withFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public Long index;
    public CreateCompletionResponseChoices withIndex(Long index) {
        this.index = index;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logprobs")
    public CreateCompletionResponseChoicesLogprobs logprobs;
    public CreateCompletionResponseChoices withLogprobs(CreateCompletionResponseChoicesLogprobs logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    public String text;
    public CreateCompletionResponseChoices withText(String text) {
        this.text = text;
        return this;
    }
    
}
