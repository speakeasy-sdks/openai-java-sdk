package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class CreateAnswerResponse {
    public String contentType;
    public CreateAnswerResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateAnswerResponse createAnswerResponse;
    public CreateAnswerResponse withCreateAnswerResponse(openai.javasdk.models.shared.CreateAnswerResponse createAnswerResponse) {
        this.createAnswerResponse = createAnswerResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateAnswerResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateAnswerResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
