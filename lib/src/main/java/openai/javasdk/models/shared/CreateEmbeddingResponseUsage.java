/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateEmbeddingResponseUsage {
    @JsonProperty("prompt_tokens")
    public Long promptTokens;

    public CreateEmbeddingResponseUsage withPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    
    @JsonProperty("total_tokens")
    public Long totalTokens;

    public CreateEmbeddingResponseUsage withTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    
    public CreateEmbeddingResponseUsage(@JsonProperty("prompt_tokens") Long promptTokens, @JsonProperty("total_tokens") Long totalTokens) {
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
  }
}
