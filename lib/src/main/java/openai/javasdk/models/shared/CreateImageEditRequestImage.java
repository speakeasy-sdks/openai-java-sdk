package openai.javasdk.models.shared;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateImageEditRequestImage {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public CreateImageEditRequestImage withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=image")
    public String image;
    public CreateImageEditRequestImage withImage(String image) {
        this.image = image;
        return this;
    }
    
}
