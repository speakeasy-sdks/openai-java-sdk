package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateSearchRequest {
    public CreateSearchPathParams pathParams;
    public CreateSearchRequest withPathParams(CreateSearchPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public undefined.undefined.models.shared.CreateSearchRequest request;
    public CreateSearchRequest withRequest(undefined.undefined.models.shared.CreateSearchRequest request) {
        this.request = request;
        return this;
    }
    
}
