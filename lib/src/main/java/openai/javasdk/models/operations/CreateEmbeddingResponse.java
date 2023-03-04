package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class CreateEmbeddingResponse {
    public String contentType;
    public CreateEmbeddingResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateEmbeddingResponse createEmbeddingResponse;
    public CreateEmbeddingResponse withCreateEmbeddingResponse(openai.javasdk.models.shared.CreateEmbeddingResponse createEmbeddingResponse) {
        this.createEmbeddingResponse = createEmbeddingResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateEmbeddingResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateEmbeddingResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
