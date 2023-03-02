package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateChatCompletionResponseChoices {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("finish_reason")
    public String finishReason;
    public CreateChatCompletionResponseChoices withFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public Long index;
    public CreateChatCompletionResponseChoices withIndex(Long index) {
        this.index = index;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public ChatCompletionResponseMessage message;
    public CreateChatCompletionResponseChoices withMessage(ChatCompletionResponseMessage message) {
        this.message = message;
        return this;
    }
    
}
