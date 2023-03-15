package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class CreateCompletionResponse {
    public String contentType;
    public CreateCompletionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateCompletionResponse createCompletionResponse;
    public CreateCompletionResponse withCreateCompletionResponse(openai.javasdk.models.shared.CreateCompletionResponse createCompletionResponse) {
        this.createCompletionResponse = createCompletionResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateCompletionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateCompletionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
