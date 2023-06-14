/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateFineTuneResponse {
    
    public String contentType;

    public CreateFineTuneResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public openai.javasdk.models.shared.FineTune fineTune;

    public CreateFineTuneResponse withFineTune(openai.javasdk.models.shared.FineTune fineTune) {
        this.fineTune = fineTune;
        return this;
    }
    
    
    public Integer statusCode;

    public CreateFineTuneResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreateFineTuneResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreateFineTuneResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
