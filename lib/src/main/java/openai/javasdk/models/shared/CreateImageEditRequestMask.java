package openai.javasdk.models.shared;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateImageEditRequestMask {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public CreateImageEditRequestMask withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=mask")
    public String mask;
    public CreateImageEditRequestMask withMask(String mask) {
        this.mask = mask;
        return this;
    }
    
}
