package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateTranslationResponse {
    @JsonProperty("text")
    public String text;
    public CreateTranslationResponse withText(String text) {
        this.text = text;
        return this;
    }
    
}
