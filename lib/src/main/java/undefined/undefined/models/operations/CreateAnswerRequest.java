package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateAnswerRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public undefined.undefined.models.shared.CreateAnswerRequest request;
    public CreateAnswerRequest withRequest(undefined.undefined.models.shared.CreateAnswerRequest request) {
        this.request = request;
        return this;
    }
    
}
