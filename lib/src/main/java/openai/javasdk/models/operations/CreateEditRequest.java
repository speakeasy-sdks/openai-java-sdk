package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateEditRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateEditRequest request;
    public CreateEditRequest withRequest(openai.javasdk.models.shared.CreateEditRequest request) {
        this.request = request;
        return this;
    }
    
}
