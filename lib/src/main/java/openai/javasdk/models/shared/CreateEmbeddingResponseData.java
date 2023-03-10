package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateEmbeddingResponseData {
    @JsonProperty("embedding")
    public Double[] embedding;
    public CreateEmbeddingResponseData withEmbedding(Double[] embedding) {
        this.embedding = embedding;
        return this;
    }
    
    @JsonProperty("index")
    public Long index;
    public CreateEmbeddingResponseData withIndex(Long index) {
        this.index = index;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public CreateEmbeddingResponseData withObject(String object) {
        this.object = object;
        return this;
    }
    
}
