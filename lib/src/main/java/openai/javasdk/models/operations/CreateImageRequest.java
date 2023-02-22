package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateImageRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateImageRequest request;
    public CreateImageRequest withRequest(openai.javasdk.models.shared.CreateImageRequest request) {
        this.request = request;
        return this;
    }
    
}
