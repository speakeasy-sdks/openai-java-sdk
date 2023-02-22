package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateEmbeddingRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public undefined.undefined.models.shared.CreateEmbeddingRequest request;
    public CreateEmbeddingRequest withRequest(undefined.undefined.models.shared.CreateEmbeddingRequest request) {
        this.request = request;
        return this;
    }
    
}
