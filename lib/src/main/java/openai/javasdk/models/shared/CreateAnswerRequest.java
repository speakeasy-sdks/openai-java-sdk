package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAnswerRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public String[] documents;
    public CreateAnswerRequest withDocuments(String[] documents) {
        this.documents = documents;
        return this;
    }
    
    @JsonProperty("examples")
    public String[][] examples;
    public CreateAnswerRequest withExamples(String[][] examples) {
        this.examples = examples;
        return this;
    }
    
    @JsonProperty("examples_context")
    public String examplesContext;
    public CreateAnswerRequest withExamplesContext(String examplesContext) {
        this.examplesContext = examplesContext;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expand")
    public Object[] expand;
    public CreateAnswerRequest withExpand(Object[] expand) {
        this.expand = expand;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public String file;
    public CreateAnswerRequest withFile(String file) {
        this.file = file;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logit_bias")
    public Object logitBias;
    public CreateAnswerRequest withLogitBias(Object logitBias) {
        this.logitBias = logitBias;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logprobs")
    public Long logprobs;
    public CreateAnswerRequest withLogprobs(Long logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_rerank")
    public Long maxRerank;
    public CreateAnswerRequest withMaxRerank(Long maxRerank) {
        this.maxRerank = maxRerank;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_tokens")
    public Long maxTokens;
    public CreateAnswerRequest withMaxTokens(Long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    
    @JsonProperty("model")
    public String model;
    public CreateAnswerRequest withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("n")
    public Long n;
    public CreateAnswerRequest withN(Long n) {
        this.n = n;
        return this;
    }
    
    @JsonProperty("question")
    public String question;
    public CreateAnswerRequest withQuestion(String question) {
        this.question = question;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("return_metadata")
    public Object returnMetadata;
    public CreateAnswerRequest withReturnMetadata(Object returnMetadata) {
        this.returnMetadata = returnMetadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("return_prompt")
    public Boolean returnPrompt;
    public CreateAnswerRequest withReturnPrompt(Boolean returnPrompt) {
        this.returnPrompt = returnPrompt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_model")
    public String searchModel;
    public CreateAnswerRequest withSearchModel(String searchModel) {
        this.searchModel = searchModel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stop")
    public Object stop;
    public CreateAnswerRequest withStop(Object stop) {
        this.stop = stop;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("temperature")
    public Double temperature;
    public CreateAnswerRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public Object user;
    public CreateAnswerRequest withUser(Object user) {
        this.user = user;
        return this;
    }
    
}
