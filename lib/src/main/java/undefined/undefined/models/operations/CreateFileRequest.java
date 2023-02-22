package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateFileRequest {
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public undefined.undefined.models.shared.CreateFileRequest request;
    public CreateFileRequest withRequest(undefined.undefined.models.shared.CreateFileRequest request) {
        this.request = request;
        return this;
    }
    
}
