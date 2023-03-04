package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class RetrieveEngineResponse {
    public String contentType;
    public RetrieveEngineResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object engine;
    public RetrieveEngineResponse withEngine(Object engine) {
        this.engine = engine;
        return this;
    }
    
    public Integer statusCode;
    public RetrieveEngineResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RetrieveEngineResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
