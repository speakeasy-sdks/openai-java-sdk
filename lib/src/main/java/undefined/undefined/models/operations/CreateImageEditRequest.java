package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateImageEditRequest {
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public undefined.undefined.models.shared.CreateImageEditRequest request;
    public CreateImageEditRequest withRequest(undefined.undefined.models.shared.CreateImageEditRequest request) {
        this.request = request;
        return this;
    }
    
}
