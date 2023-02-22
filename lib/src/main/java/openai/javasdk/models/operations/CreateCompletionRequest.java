package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateCompletionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateCompletionRequest request;
    public CreateCompletionRequest withRequest(openai.javasdk.models.shared.CreateCompletionRequest request) {
        this.request = request;
        return this;
    }
    
}
