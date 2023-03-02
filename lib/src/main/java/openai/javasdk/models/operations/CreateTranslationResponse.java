package openai.javasdk.models.operations;



public class CreateTranslationResponse {
    public String contentType;
    public CreateTranslationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateTranslationResponse createTranslationResponse;
    public CreateTranslationResponse withCreateTranslationResponse(openai.javasdk.models.shared.CreateTranslationResponse createTranslationResponse) {
        this.createTranslationResponse = createTranslationResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateTranslationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
