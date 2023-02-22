package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateImageVariationRequest {
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public undefined.undefined.models.shared.CreateImageVariationRequest request;
    public CreateImageVariationRequest withRequest(undefined.undefined.models.shared.CreateImageVariationRequest request) {
        this.request = request;
        return this;
    }
    
}
