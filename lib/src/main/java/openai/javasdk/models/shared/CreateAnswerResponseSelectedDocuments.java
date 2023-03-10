package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAnswerResponseSelectedDocuments {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document")
    public Long document;
    public CreateAnswerResponseSelectedDocuments withDocument(Long document) {
        this.document = document;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    public String text;
    public CreateAnswerResponseSelectedDocuments withText(String text) {
        this.text = text;
        return this;
    }
    
}
