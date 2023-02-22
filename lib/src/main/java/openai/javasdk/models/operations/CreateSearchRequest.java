package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateSearchRequest {
    public CreateSearchPathParams pathParams;
    public CreateSearchRequest withPathParams(CreateSearchPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateSearchRequest request;
    public CreateSearchRequest withRequest(openai.javasdk.models.shared.CreateSearchRequest request) {
        this.request = request;
        return this;
    }
    
}
