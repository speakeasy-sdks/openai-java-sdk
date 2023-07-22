/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListFineTuneEventsResponse - OK
 */

public class ListFineTuneEventsResponse {
    @JsonProperty("data")
    public FineTuneEvent[] data;

    public ListFineTuneEventsResponse withData(FineTuneEvent[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("object")
    public String object;

    public ListFineTuneEventsResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
    public ListFineTuneEventsResponse(@JsonProperty("data") FineTuneEvent[] data, @JsonProperty("object") String object) {
        this.data = data;
        this.object = object;
  }
}
