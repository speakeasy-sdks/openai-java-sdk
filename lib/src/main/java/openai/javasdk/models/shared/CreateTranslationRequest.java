package openai.javasdk.models.shared;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateTranslationRequest {
    @SpeakeasyMetadata("multipartForm:file")
    public CreateTranslationRequestFile file;
    public CreateTranslationRequest withFile(CreateTranslationRequestFile file) {
        this.file = file;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=model")
    public String model;
    public CreateTranslationRequest withModel(String model) {
        this.model = model;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=prompt")
    public String prompt;
    public CreateTranslationRequest withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=response_format")
    public String responseFormat;
    public CreateTranslationRequest withResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=temperature")
    public Double temperature;
    public CreateTranslationRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
}
