package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateChatCompletionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateChatCompletionRequest request;
    public CreateChatCompletionRequest withRequest(openai.javasdk.models.shared.CreateChatCompletionRequest request) {
        this.request = request;
        return this;
    }
    
}
