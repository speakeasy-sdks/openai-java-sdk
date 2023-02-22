package undefined.undefined.models.shared;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateImageEditRequest {
    @SpeakeasyMetadata("multipartForm:file")
    public CreateImageEditRequestImage image;
    public CreateImageEditRequest withImage(CreateImageEditRequestImage image) {
        this.image = image;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:file")
    public CreateImageEditRequestMask mask;
    public CreateImageEditRequest withMask(CreateImageEditRequestMask mask) {
        this.mask = mask;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=n")
    public Object n;
    public CreateImageEditRequest withN(Object n) {
        this.n = n;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=prompt")
    public String prompt;
    public CreateImageEditRequest withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=response_format")
    public Object responseFormat;
    public CreateImageEditRequest withResponseFormat(Object responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=size")
    public Object size;
    public CreateImageEditRequest withSize(Object size) {
        this.size = size;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=user")
    public Object user;
    public CreateImageEditRequest withUser(Object user) {
        this.user = user;
        return this;
    }
    
}
