/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class CreateChatCompletionResponse {
    
    public String contentType;
    public CreateChatCompletionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public openai.javasdk.models.shared.CreateChatCompletionResponse createChatCompletionResponse;
    public CreateChatCompletionResponse withCreateChatCompletionResponse(openai.javasdk.models.shared.CreateChatCompletionResponse createChatCompletionResponse) {
        this.createChatCompletionResponse = createChatCompletionResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public CreateChatCompletionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public CreateChatCompletionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreateChatCompletionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
