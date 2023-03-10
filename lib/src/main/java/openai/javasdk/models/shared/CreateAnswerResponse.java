package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAnswerResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("answers")
    public String[] answers;
    public CreateAnswerResponse withAnswers(String[] answers) {
        this.answers = answers;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completion")
    public String completion;
    public CreateAnswerResponse withCompletion(String completion) {
        this.completion = completion;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model")
    public String model;
    public CreateAnswerResponse withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public String object;
    public CreateAnswerResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_model")
    public String searchModel;
    public CreateAnswerResponse withSearchModel(String searchModel) {
        this.searchModel = searchModel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selected_documents")
    public CreateAnswerResponseSelectedDocuments[] selectedDocuments;
    public CreateAnswerResponse withSelectedDocuments(CreateAnswerResponseSelectedDocuments[] selectedDocuments) {
        this.selectedDocuments = selectedDocuments;
        return this;
    }
    
}
