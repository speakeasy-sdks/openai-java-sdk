package undefined.undefined.models.shared;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateImageVariationRequest {
    @SpeakeasyMetadata("multipartForm:file")
    public CreateImageVariationRequestImage image;
    public CreateImageVariationRequest withImage(CreateImageVariationRequestImage image) {
        this.image = image;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=n")
    public Object n;
    public CreateImageVariationRequest withN(Object n) {
        this.n = n;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=response_format")
    public Object responseFormat;
    public CreateImageVariationRequest withResponseFormat(Object responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=size")
    public Object size;
    public CreateImageVariationRequest withSize(Object size) {
        this.size = size;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=user")
    public Object user;
    public CreateImageVariationRequest withUser(Object user) {
        this.user = user;
        return this;
    }
    
}
