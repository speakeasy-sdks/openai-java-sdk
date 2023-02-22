package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCompletionResponseUsage {
    @JsonProperty("completion_tokens")
    public Long completionTokens;
    public CreateCompletionResponseUsage withCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    
    @JsonProperty("prompt_tokens")
    public Long promptTokens;
    public CreateCompletionResponseUsage withPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    
    @JsonProperty("total_tokens")
    public Long totalTokens;
    public CreateCompletionResponseUsage withTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    
}
