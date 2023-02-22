package openai.javasdk.models.operations;



public class CreateModerationResponse {
    public String contentType;
    public CreateModerationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateModerationResponse createModerationResponse;
    public CreateModerationResponse withCreateModerationResponse(openai.javasdk.models.shared.CreateModerationResponse createModerationResponse) {
        this.createModerationResponse = createModerationResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateModerationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
