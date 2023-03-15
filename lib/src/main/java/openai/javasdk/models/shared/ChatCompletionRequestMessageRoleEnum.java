package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ChatCompletionRequestMessageRoleEnum {
    SYSTEM("system"),
    USER("user"),
    ASSISTANT("assistant");

    @JsonValue
    public final String value;

    private ChatCompletionRequestMessageRoleEnum(String value) {
        this.value = value;
    }
}
