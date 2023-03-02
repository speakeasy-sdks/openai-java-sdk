package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatCompletionRequestMessage {
    @JsonProperty("content")
    public String content;
    public ChatCompletionRequestMessage withContent(String content) {
        this.content = content;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public ChatCompletionRequestMessage withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("role")
    public ChatCompletionRequestMessageRoleEnum role;
    public ChatCompletionRequestMessage withRole(ChatCompletionRequestMessageRoleEnum role) {
        this.role = role;
        return this;
    }
    
}
