/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateChatCompletionResponseUsage {
    @JsonProperty("completion_tokens")
    public Long completionTokens;
    public CreateChatCompletionResponseUsage withCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    
    @JsonProperty("prompt_tokens")
    public Long promptTokens;
    public CreateChatCompletionResponseUsage withPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    
    @JsonProperty("total_tokens")
    public Long totalTokens;
    public CreateChatCompletionResponseUsage withTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    
}
