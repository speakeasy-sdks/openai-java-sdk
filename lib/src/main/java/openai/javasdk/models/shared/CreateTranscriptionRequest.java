package openai.javasdk.models.shared;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateTranscriptionRequest {
    @SpeakeasyMetadata("multipartForm:file")
    public CreateTranscriptionRequestFile file;
    public CreateTranscriptionRequest withFile(CreateTranscriptionRequestFile file) {
        this.file = file;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=language")
    public String language;
    public CreateTranscriptionRequest withLanguage(String language) {
        this.language = language;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=model")
    public String model;
    public CreateTranscriptionRequest withModel(String model) {
        this.model = model;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=prompt")
    public String prompt;
    public CreateTranscriptionRequest withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=response_format")
    public String responseFormat;
    public CreateTranscriptionRequest withResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=temperature")
    public Double temperature;
    public CreateTranscriptionRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
}
