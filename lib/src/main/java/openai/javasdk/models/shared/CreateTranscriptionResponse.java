/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateTranscriptionResponse - OK
 */

public class CreateTranscriptionResponse {
    @JsonProperty("text")
    public String text;

    public CreateTranscriptionResponse withText(String text) {
        this.text = text;
        return this;
    }
    
    public CreateTranscriptionResponse(@JsonProperty("text") String text) {
        this.text = text;
  }
}
