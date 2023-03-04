package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class ListModelsResponse {
    public String contentType;
    public ListModelsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.ListModelsResponse listModelsResponse;
    public ListModelsResponse withListModelsResponse(openai.javasdk.models.shared.ListModelsResponse listModelsResponse) {
        this.listModelsResponse = listModelsResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListModelsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ListModelsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
