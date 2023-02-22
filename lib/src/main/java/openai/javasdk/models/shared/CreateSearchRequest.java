package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateSearchRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public String[] documents;
    public CreateSearchRequest withDocuments(String[] documents) {
        this.documents = documents;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public String file;
    public CreateSearchRequest withFile(String file) {
        this.file = file;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_rerank")
    public Long maxRerank;
    public CreateSearchRequest withMaxRerank(Long maxRerank) {
        this.maxRerank = maxRerank;
        return this;
    }
    
    @JsonProperty("query")
    public String query;
    public CreateSearchRequest withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("return_metadata")
    public Boolean returnMetadata;
    public CreateSearchRequest withReturnMetadata(Boolean returnMetadata) {
        this.returnMetadata = returnMetadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public Object user;
    public CreateSearchRequest withUser(Object user) {
        this.user = user;
        return this;
    }
    
}
