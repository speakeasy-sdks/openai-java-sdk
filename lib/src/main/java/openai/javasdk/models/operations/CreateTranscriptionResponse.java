/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateTranscriptionResponse {
    
    public String contentType;

    public CreateTranscriptionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public openai.javasdk.models.shared.CreateTranscriptionResponse createTranscriptionResponse;

    public CreateTranscriptionResponse withCreateTranscriptionResponse(openai.javasdk.models.shared.CreateTranscriptionResponse createTranscriptionResponse) {
        this.createTranscriptionResponse = createTranscriptionResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public CreateTranscriptionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreateTranscriptionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreateTranscriptionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
