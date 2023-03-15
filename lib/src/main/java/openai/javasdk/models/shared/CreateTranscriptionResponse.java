package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateTranscriptionResponse {
    @JsonProperty("text")
    public String text;
    public CreateTranscriptionResponse withText(String text) {
        this.text = text;
        return this;
    }
    
}
