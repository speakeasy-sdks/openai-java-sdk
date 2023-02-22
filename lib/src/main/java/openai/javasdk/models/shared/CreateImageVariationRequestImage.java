package openai.javasdk.models.shared;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateImageVariationRequestImage {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public CreateImageVariationRequestImage withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=image")
    public String image;
    public CreateImageVariationRequestImage withImage(String image) {
        this.image = image;
        return this;
    }
    
}
