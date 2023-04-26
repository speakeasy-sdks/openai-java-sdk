/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListFineTunesResponse - OK
 */
public class ListFineTunesResponse {
    @JsonProperty("data")
    public FineTune[] data;
    public ListFineTunesResponse withData(FineTune[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public ListFineTunesResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
    public ListFineTunesResponse(@JsonProperty("data") FineTune[] data, @JsonProperty("object") String object) {
        this.data = data;
        this.object = object;
  }
}
