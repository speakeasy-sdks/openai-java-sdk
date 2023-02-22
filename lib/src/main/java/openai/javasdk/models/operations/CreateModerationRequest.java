package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateModerationRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateModerationRequest request;
    public CreateModerationRequest withRequest(openai.javasdk.models.shared.CreateModerationRequest request) {
        this.request = request;
        return this;
    }
    
}
