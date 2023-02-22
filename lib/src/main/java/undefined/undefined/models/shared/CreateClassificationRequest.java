package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateClassificationRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("examples")
    public String[][] examples;
    public CreateClassificationRequest withExamples(String[][] examples) {
        this.examples = examples;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expand")
    public Object expand;
    public CreateClassificationRequest withExpand(Object expand) {
        this.expand = expand;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public String file;
    public CreateClassificationRequest withFile(String file) {
        this.file = file;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("labels")
    public String[] labels;
    public CreateClassificationRequest withLabels(String[] labels) {
        this.labels = labels;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logit_bias")
    public Object logitBias;
    public CreateClassificationRequest withLogitBias(Object logitBias) {
        this.logitBias = logitBias;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logprobs")
    public Object logprobs;
    public CreateClassificationRequest withLogprobs(Object logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_examples")
    public Long maxExamples;
    public CreateClassificationRequest withMaxExamples(Long maxExamples) {
        this.maxExamples = maxExamples;
        return this;
    }
    
    @JsonProperty("model")
    public Object model;
    public CreateClassificationRequest withModel(Object model) {
        this.model = model;
        return this;
    }
    
    @JsonProperty("query")
    public String query;
    public CreateClassificationRequest withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("return_metadata")
    public Object returnMetadata;
    public CreateClassificationRequest withReturnMetadata(Object returnMetadata) {
        this.returnMetadata = returnMetadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("return_prompt")
    public Object returnPrompt;
    public CreateClassificationRequest withReturnPrompt(Object returnPrompt) {
        this.returnPrompt = returnPrompt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_model")
    public Object searchModel;
    public CreateClassificationRequest withSearchModel(Object searchModel) {
        this.searchModel = searchModel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("temperature")
    public Double temperature;
    public CreateClassificationRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public Object user;
    public CreateClassificationRequest withUser(Object user) {
        this.user = user;
        return this;
    }
    
}
