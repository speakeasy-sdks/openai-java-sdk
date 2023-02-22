package undefined.undefined.models.operations;



public class CreateCompletionResponse {
    public String contentType;
    public CreateCompletionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public undefined.undefined.models.shared.CreateCompletionResponse createCompletionResponse;
    public CreateCompletionResponse withCreateCompletionResponse(undefined.undefined.models.shared.CreateCompletionResponse createCompletionResponse) {
        this.createCompletionResponse = createCompletionResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateCompletionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
