package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateClassificationRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateClassificationRequest request;
    public CreateClassificationRequest withRequest(openai.javasdk.models.shared.CreateClassificationRequest request) {
        this.request = request;
        return this;
    }
    
}
