package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateTranscriptionRequest {
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public openai.javasdk.models.shared.CreateTranscriptionRequest request;
    public CreateTranscriptionRequest withRequest(openai.javasdk.models.shared.CreateTranscriptionRequest request) {
        this.request = request;
        return this;
    }
    
}
