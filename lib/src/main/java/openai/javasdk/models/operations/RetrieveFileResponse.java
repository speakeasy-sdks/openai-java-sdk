package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class RetrieveFileResponse {
    public String contentType;
    public RetrieveFileResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object openAIFile;
    public RetrieveFileResponse withOpenAIFile(Object openAIFile) {
        this.openAIFile = openAIFile;
        return this;
    }
    
    public Integer statusCode;
    public RetrieveFileResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RetrieveFileResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
