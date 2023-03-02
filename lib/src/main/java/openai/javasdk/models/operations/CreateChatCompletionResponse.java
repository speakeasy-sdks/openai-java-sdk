package openai.javasdk.models.operations;



public class CreateChatCompletionResponse {
    public String contentType;
    public CreateChatCompletionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateChatCompletionResponse createChatCompletionResponse;
    public CreateChatCompletionResponse withCreateChatCompletionResponse(openai.javasdk.models.shared.CreateChatCompletionResponse createChatCompletionResponse) {
        this.createChatCompletionResponse = createChatCompletionResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateChatCompletionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
