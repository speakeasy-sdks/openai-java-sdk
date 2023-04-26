/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListEnginesResponse - OK
 */
public class ListEnginesResponse {
    @JsonProperty("data")
    public Engine[] data;
    public ListEnginesResponse withData(Engine[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public ListEnginesResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
    public ListEnginesResponse(@JsonProperty("data") Engine[] data, @JsonProperty("object") String object) {
        this.data = data;
        this.object = object;
  }
}
