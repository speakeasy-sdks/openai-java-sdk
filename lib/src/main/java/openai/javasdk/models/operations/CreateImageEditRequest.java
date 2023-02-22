package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateImageEditRequest {
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public openai.javasdk.models.shared.CreateImageEditRequest request;
    public CreateImageEditRequest withRequest(openai.javasdk.models.shared.CreateImageEditRequest request) {
        this.request = request;
        return this;
    }
    
}
