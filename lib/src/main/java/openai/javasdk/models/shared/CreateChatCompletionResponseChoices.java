/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateChatCompletionResponseChoices {
    @JsonProperty("finish_reason")
    public CreateChatCompletionResponseChoicesFinishReason finishReason;

    public CreateChatCompletionResponseChoices withFinishReason(CreateChatCompletionResponseChoicesFinishReason finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    
    @JsonProperty("index")
    public Long index;

    public CreateChatCompletionResponseChoices withIndex(Long index) {
        this.index = index;
        return this;
    }
    
    @JsonProperty("message")
    public ChatCompletionResponseMessage message;

    public CreateChatCompletionResponseChoices withMessage(ChatCompletionResponseMessage message) {
        this.message = message;
        return this;
    }
    
    public CreateChatCompletionResponseChoices(@JsonProperty("finish_reason") CreateChatCompletionResponseChoicesFinishReason finishReason, @JsonProperty("index") Long index, @JsonProperty("message") ChatCompletionResponseMessage message) {
        this.finishReason = finishReason;
        this.index = index;
        this.message = message;
  }
}
