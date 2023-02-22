package undefined.undefined.models.shared;

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
    
}
