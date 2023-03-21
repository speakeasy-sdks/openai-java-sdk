package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class CreateTranscriptionResponse {
    public String contentType;
    public CreateTranscriptionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateTranscriptionResponse createTranscriptionResponse;
    public CreateTranscriptionResponse withCreateTranscriptionResponse(openai.javasdk.models.shared.CreateTranscriptionResponse createTranscriptionResponse) {
        this.createTranscriptionResponse = createTranscriptionResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateTranscriptionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateTranscriptionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}