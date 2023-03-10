package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateSearchResponseData {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document")
    public Long document;
    public CreateSearchResponseData withDocument(Long document) {
        this.document = document;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public String object;
    public CreateSearchResponseData withObject(String object) {
        this.object = object;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("score")
    public Double score;
    public CreateSearchResponseData withScore(Double score) {
        this.score = score;
        return this;
    }
    
}
