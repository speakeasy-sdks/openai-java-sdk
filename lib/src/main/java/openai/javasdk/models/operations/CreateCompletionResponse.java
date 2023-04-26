/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class CreateCompletionResponse {
    
    public String contentType;
    public CreateCompletionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public openai.javasdk.models.shared.CreateCompletionResponse createCompletionResponse;
    public CreateCompletionResponse withCreateCompletionResponse(openai.javasdk.models.shared.CreateCompletionResponse createCompletionResponse) {
        this.createCompletionResponse = createCompletionResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public CreateCompletionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public CreateCompletionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreateCompletionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
