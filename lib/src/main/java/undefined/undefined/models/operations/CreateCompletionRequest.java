package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateCompletionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public undefined.undefined.models.shared.CreateCompletionRequest request;
    public CreateCompletionRequest withRequest(undefined.undefined.models.shared.CreateCompletionRequest request) {
        this.request = request;
        return this;
    }
    
}
