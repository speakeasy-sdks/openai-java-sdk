package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class RetrieveModelResponse {
    public String contentType;
    public RetrieveModelResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object model;
    public RetrieveModelResponse withModel(Object model) {
        this.model = model;
        return this;
    }
    
    public Integer statusCode;
    public RetrieveModelResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RetrieveModelResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
