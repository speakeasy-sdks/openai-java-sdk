package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateImageVariationRequest {
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public openai.javasdk.models.shared.CreateImageVariationRequest request;
    public CreateImageVariationRequest withRequest(openai.javasdk.models.shared.CreateImageVariationRequest request) {
        this.request = request;
        return this;
    }
    
}
