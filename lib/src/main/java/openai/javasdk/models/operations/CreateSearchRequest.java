package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateSearchRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateSearchRequest createSearchRequest;
    public CreateSearchRequest withCreateSearchRequest(openai.javasdk.models.shared.CreateSearchRequest createSearchRequest) {
        this.createSearchRequest = createSearchRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=engine_id")
    public String engineId;
    public CreateSearchRequest withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }
    
}
