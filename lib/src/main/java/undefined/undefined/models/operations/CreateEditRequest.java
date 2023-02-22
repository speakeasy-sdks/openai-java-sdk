package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateEditRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public undefined.undefined.models.shared.CreateEditRequest request;
    public CreateEditRequest withRequest(undefined.undefined.models.shared.CreateEditRequest request) {
        this.request = request;
        return this;
    }
    
}
