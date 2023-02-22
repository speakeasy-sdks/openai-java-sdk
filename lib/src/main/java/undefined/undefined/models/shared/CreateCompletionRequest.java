package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCompletionRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("best_of")
    public Long bestOf;
    public CreateCompletionRequest withBestOf(Long bestOf) {
        this.bestOf = bestOf;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("echo")
    public Boolean echo;
    public CreateCompletionRequest withEcho(Boolean echo) {
        this.echo = echo;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("frequency_penalty")
    public Double frequencyPenalty;
    public CreateCompletionRequest withFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logit_bias")
    public java.util.Map<String, Object> logitBias;
    public CreateCompletionRequest withLogitBias(java.util.Map<String, Object> logitBias) {
        this.logitBias = logitBias;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logprobs")
    public Long logprobs;
    public CreateCompletionRequest withLogprobs(Long logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_tokens")
    public Long maxTokens;
    public CreateCompletionRequest withMaxTokens(Long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    
    @JsonProperty("model")
    public String model;
    public CreateCompletionRequest withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("n")
    public Long n;
    public CreateCompletionRequest withN(Long n) {
        this.n = n;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("presence_penalty")
    public Double presencePenalty;
    public CreateCompletionRequest withPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prompt")
    public Object prompt;
    public CreateCompletionRequest withPrompt(Object prompt) {
        this.prompt = prompt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stop")
    public Object stop;
    public CreateCompletionRequest withStop(Object stop) {
        this.stop = stop;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stream")
    public Boolean stream;
    public CreateCompletionRequest withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("suffix")
    public String suffix;
    public CreateCompletionRequest withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("temperature")
    public Double temperature;
    public CreateCompletionRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("top_p")
    public Double topP;
    public CreateCompletionRequest withTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public String user;
    public CreateCompletionRequest withUser(String user) {
        this.user = user;
        return this;
    }
    
}
