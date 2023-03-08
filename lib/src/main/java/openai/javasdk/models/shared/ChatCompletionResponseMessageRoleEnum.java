package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ChatCompletionResponseMessageRoleEnum {
    SYSTEM("system"),
    USER("user"),
    ASSISTANT("assistant");

    @JsonValue
    public final String value;

    private ChatCompletionResponseMessageRoleEnum(String value) {
        this.value = value;
    }
}
