package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateFineTuneRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public undefined.undefined.models.shared.CreateFineTuneRequest request;
    public CreateFineTuneRequest withRequest(undefined.undefined.models.shared.CreateFineTuneRequest request) {
        this.request = request;
        return this;
    }
    
}
