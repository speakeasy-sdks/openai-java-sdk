/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateModerationResponse - OK
 */
public class CreateModerationResponse {
    @JsonProperty("id")
    public String id;
    public CreateModerationResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("model")
    public String model;
    public CreateModerationResponse withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonProperty("results")
    public CreateModerationResponseResults[] results;
    public CreateModerationResponse withResults(CreateModerationResponseResults[] results) {
        this.results = results;
        return this;
    }
    

    public CreateModerationResponse(@JsonProperty("id") String id, @JsonProperty("model") String model, @JsonProperty("results") CreateModerationResponseResults[] results) {
    this.id = id;
this.model = model;
this.results = results;
  }
}
