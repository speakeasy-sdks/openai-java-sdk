/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListFilesResponse - OK
 */
public class ListFilesResponse {
    @JsonProperty("data")
    public OpenAIFile[] data;
    public ListFilesResponse withData(OpenAIFile[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public ListFilesResponse withObject(String object) {
        this.object = object;
        return this;
    }
    

    public ListFilesResponse(@JsonProperty("data") OpenAIFile[] data, @JsonProperty("object") String object) {
    this.data = data;
this.object = object;
  }
}
