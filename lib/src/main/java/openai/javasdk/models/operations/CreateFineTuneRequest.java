package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateFineTuneRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public openai.javasdk.models.shared.CreateFineTuneRequest request;
    public CreateFineTuneRequest withRequest(openai.javasdk.models.shared.CreateFineTuneRequest request) {
        this.request = request;
        return this;
    }
    
}
