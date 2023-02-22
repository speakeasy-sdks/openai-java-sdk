package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateFileRequest {
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public openai.javasdk.models.shared.CreateFileRequest request;
    public CreateFileRequest withRequest(openai.javasdk.models.shared.CreateFileRequest request) {
        this.request = request;
        return this;
    }
    
}
