package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateClassificationResponseSelectedExamples {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document")
    public Long document;
    public CreateClassificationResponseSelectedExamples withDocument(Long document) {
        this.document = document;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    public String label;
    public CreateClassificationResponseSelectedExamples withLabel(String label) {
        this.label = label;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    public String text;
    public CreateClassificationResponseSelectedExamples withText(String text) {
        this.text = text;
        return this;
    }
    
}
