package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCompletionResponseChoicesLogprobs {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_offset")
    public Long[] textOffset;
    public CreateCompletionResponseChoicesLogprobs withTextOffset(Long[] textOffset) {
        this.textOffset = textOffset;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token_logprobs")
    public Double[] tokenLogprobs;
    public CreateCompletionResponseChoicesLogprobs withTokenLogprobs(Double[] tokenLogprobs) {
        this.tokenLogprobs = tokenLogprobs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tokens")
    public String[] tokens;
    public CreateCompletionResponseChoicesLogprobs withTokens(String[] tokens) {
        this.tokens = tokens;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("top_logprobs")
    public java.util.Map<String, Object>[] topLogprobs;
    public CreateCompletionResponseChoicesLogprobs withTopLogprobs(java.util.Map<String, Object>[] topLogprobs) {
        this.topLogprobs = topLogprobs;
        return this;
    }
    
}
