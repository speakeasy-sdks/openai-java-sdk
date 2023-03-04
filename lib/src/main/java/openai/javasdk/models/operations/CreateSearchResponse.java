package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class CreateSearchResponse {
    public String contentType;
    public CreateSearchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateSearchResponse createSearchResponse;
    public CreateSearchResponse withCreateSearchResponse(openai.javasdk.models.shared.CreateSearchResponse createSearchResponse) {
        this.createSearchResponse = createSearchResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateSearchResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateSearchResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
