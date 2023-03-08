package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateTranslationRequest {
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public openai.javasdk.models.shared.CreateTranslationRequest request;
    public CreateTranslationRequest withRequest(openai.javasdk.models.shared.CreateTranslationRequest request) {
        this.request = request;
        return this;
    }
    
}
