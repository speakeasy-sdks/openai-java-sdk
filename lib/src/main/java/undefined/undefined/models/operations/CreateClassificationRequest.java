package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateClassificationRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public undefined.undefined.models.shared.CreateClassificationRequest request;
    public CreateClassificationRequest withRequest(undefined.undefined.models.shared.CreateClassificationRequest request) {
        this.request = request;
        return this;
    }
    
}
