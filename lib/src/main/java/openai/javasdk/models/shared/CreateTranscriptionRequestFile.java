package openai.javasdk.models.shared;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateTranscriptionRequestFile {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public CreateTranscriptionRequestFile withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=file")
    public String file;
    public CreateTranscriptionRequestFile withFile(String file) {
        this.file = file;
        return this;
    }
    
}