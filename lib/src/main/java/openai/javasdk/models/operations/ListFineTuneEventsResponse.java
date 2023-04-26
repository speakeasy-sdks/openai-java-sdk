/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ListFineTuneEventsResponse {
    
    public String contentType;
    public ListFineTuneEventsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public openai.javasdk.models.shared.ListFineTuneEventsResponse listFineTuneEventsResponse;
    public ListFineTuneEventsResponse withListFineTuneEventsResponse(openai.javasdk.models.shared.ListFineTuneEventsResponse listFineTuneEventsResponse) {
        this.listFineTuneEventsResponse = listFineTuneEventsResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public ListFineTuneEventsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public ListFineTuneEventsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListFineTuneEventsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
