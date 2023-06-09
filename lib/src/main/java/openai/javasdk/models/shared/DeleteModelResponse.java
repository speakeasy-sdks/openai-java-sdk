/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteModelResponse - OK
 */
public class DeleteModelResponse {
    @JsonProperty("deleted")
    public Boolean deleted;

    public DeleteModelResponse withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public DeleteModelResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("object")
    public String object;

    public DeleteModelResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
    public DeleteModelResponse(@JsonProperty("deleted") Boolean deleted, @JsonProperty("id") String id, @JsonProperty("object") String object) {
        this.deleted = deleted;
        this.id = id;
        this.object = object;
  }
}
