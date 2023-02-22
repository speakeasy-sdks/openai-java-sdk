package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateEmbeddingRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateEmbeddingRequest request;
    public CreateEmbeddingRequest withRequest(openai.javasdk.models.shared.CreateEmbeddingRequest request) {
        this.request = request;
        return this;
    }
    
}
