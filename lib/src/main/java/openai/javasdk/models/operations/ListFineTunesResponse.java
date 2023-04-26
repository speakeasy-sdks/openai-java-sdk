/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ListFineTunesResponse {
    
    public String contentType;
    public ListFineTunesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public openai.javasdk.models.shared.ListFineTunesResponse listFineTunesResponse;
    public ListFineTunesResponse withListFineTunesResponse(openai.javasdk.models.shared.ListFineTunesResponse listFineTunesResponse) {
        this.listFineTunesResponse = listFineTunesResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public ListFineTunesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public ListFineTunesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListFineTunesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
