package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class ListEnginesResponse {
    public String contentType;
    public ListEnginesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.ListEnginesResponse listEnginesResponse;
    public ListEnginesResponse withListEnginesResponse(openai.javasdk.models.shared.ListEnginesResponse listEnginesResponse) {
        this.listEnginesResponse = listEnginesResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListEnginesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ListEnginesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
