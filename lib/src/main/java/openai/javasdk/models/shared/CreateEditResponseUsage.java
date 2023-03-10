package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateEditResponseUsage {
    @JsonProperty("completion_tokens")
    public Long completionTokens;
    public CreateEditResponseUsage withCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    
    @JsonProperty("prompt_tokens")
    public Long promptTokens;
    public CreateEditResponseUsage withPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    
    @JsonProperty("total_tokens")
    public Long totalTokens;
    public CreateEditResponseUsage withTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    
}
