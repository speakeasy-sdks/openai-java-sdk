package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateModerationRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public undefined.undefined.models.shared.CreateModerationRequest request;
    public CreateModerationRequest withRequest(undefined.undefined.models.shared.CreateModerationRequest request) {
        this.request = request;
        return this;
    }
    
}
