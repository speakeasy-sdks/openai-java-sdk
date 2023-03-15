package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class CreateEditResponse {
    public String contentType;
    public CreateEditResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateEditResponse createEditResponse;
    public CreateEditResponse withCreateEditResponse(openai.javasdk.models.shared.CreateEditResponse createEditResponse) {
        this.createEditResponse = createEditResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateEditResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateEditResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
