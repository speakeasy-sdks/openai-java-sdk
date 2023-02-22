package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateAnswerRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateAnswerRequest request;
    public CreateAnswerRequest withRequest(openai.javasdk.models.shared.CreateAnswerRequest request) {
        this.request = request;
        return this;
    }
    
}
