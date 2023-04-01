/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListModelsResponse - OK
 */
public class ListModelsResponse {
    @JsonProperty("data")
    public Model[] data;
    public ListModelsResponse withData(Model[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public ListModelsResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
}
