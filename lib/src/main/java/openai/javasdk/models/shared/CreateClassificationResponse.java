package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateClassificationResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completion")
    public String completion;
    public CreateClassificationResponse withCompletion(String completion) {
        this.completion = completion;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    public String label;
    public CreateClassificationResponse withLabel(String label) {
        this.label = label;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model")
    public String model;
    public CreateClassificationResponse withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public String object;
    public CreateClassificationResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_model")
    public String searchModel;
    public CreateClassificationResponse withSearchModel(String searchModel) {
        this.searchModel = searchModel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selected_examples")
    public CreateClassificationResponseSelectedExamples[] selectedExamples;
    public CreateClassificationResponse withSelectedExamples(CreateClassificationResponseSelectedExamples[] selectedExamples) {
        this.selectedExamples = selectedExamples;
        return this;
    }
    
}
