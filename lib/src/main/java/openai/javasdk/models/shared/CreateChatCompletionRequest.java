package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateChatCompletionRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("frequency_penalty")
    public Double frequencyPenalty;
    public CreateChatCompletionRequest withFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logit_bias")
    public java.util.Map<String, Object> logitBias;
    public CreateChatCompletionRequest withLogitBias(java.util.Map<String, Object> logitBias) {
        this.logitBias = logitBias;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_tokens")
    public Long maxTokens;
    public CreateChatCompletionRequest withMaxTokens(Long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    
    @JsonProperty("messages")
    public ChatCompletionRequestMessage[] messages;
    public CreateChatCompletionRequest withMessages(ChatCompletionRequestMessage[] messages) {
        this.messages = messages;
        return this;
    }
    
    @JsonProperty("model")
    public String model;
    public CreateChatCompletionRequest withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("n")
    public Long n;
    public CreateChatCompletionRequest withN(Long n) {
        this.n = n;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("presence_penalty")
    public Double presencePenalty;
    public CreateChatCompletionRequest withPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stop")
    public Object stop;
    public CreateChatCompletionRequest withStop(Object stop) {
        this.stop = stop;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stream")
    public Boolean stream;
    public CreateChatCompletionRequest withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("temperature")
    public Double temperature;
    public CreateChatCompletionRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("top_p")
    public Double topP;
    public CreateChatCompletionRequest withTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public Object user;
    public CreateChatCompletionRequest withUser(Object user) {
        this.user = user;
        return this;
    }
    
}
