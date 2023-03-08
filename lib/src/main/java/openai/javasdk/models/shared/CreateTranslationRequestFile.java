package openai.javasdk.models.shared;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateTranslationRequestFile {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public CreateTranslationRequestFile withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=file")
    public String file;
    public CreateTranslationRequestFile withFile(String file) {
        this.file = file;
        return this;
    }
    
}
