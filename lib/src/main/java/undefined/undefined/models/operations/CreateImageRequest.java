package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateImageRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public undefined.undefined.models.shared.CreateImageRequest request;
    public CreateImageRequest withRequest(undefined.undefined.models.shared.CreateImageRequest request) {
        this.request = request;
        return this;
    }
    
}
