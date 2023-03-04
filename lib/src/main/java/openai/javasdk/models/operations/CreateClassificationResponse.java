package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class CreateClassificationResponse {
    public String contentType;
    public CreateClassificationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateClassificationResponse createClassificationResponse;
    public CreateClassificationResponse withCreateClassificationResponse(openai.javasdk.models.shared.CreateClassificationResponse createClassificationResponse) {
        this.createClassificationResponse = createClassificationResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateClassificationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateClassificationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
