package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatCompletionResponseMessage {
    @JsonProperty("content")
    public String content;
    public ChatCompletionResponseMessage withContent(String content) {
        this.content = content;
        return this;
    }
    
    @JsonProperty("role")
    public ChatCompletionResponseMessageRoleEnum role;
    public ChatCompletionResponseMessage withRole(ChatCompletionResponseMessageRoleEnum role) {
        this.role = role;
        return this;
    }
    
}
