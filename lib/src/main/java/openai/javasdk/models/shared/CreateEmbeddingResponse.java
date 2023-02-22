package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateEmbeddingResponse {
    @JsonProperty("data")
    public CreateEmbeddingResponseData[] data;
    public CreateEmbeddingResponse withData(CreateEmbeddingResponseData[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("model")
    public String model;
    public CreateEmbeddingResponse withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public CreateEmbeddingResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
    @JsonProperty("usage")
    public CreateEmbeddingResponseUsage usage;
    public CreateEmbeddingResponse withUsage(CreateEmbeddingResponseUsage usage) {
        this.usage = usage;
        return this;
    }
    
}
