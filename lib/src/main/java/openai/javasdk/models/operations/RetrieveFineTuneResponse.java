package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class RetrieveFineTuneResponse {
    public String contentType;
    public RetrieveFineTuneResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object fineTune;
    public RetrieveFineTuneResponse withFineTune(Object fineTune) {
        this.fineTune = fineTune;
        return this;
    }
    
    public Integer statusCode;
    public RetrieveFineTuneResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public RetrieveFineTuneResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
