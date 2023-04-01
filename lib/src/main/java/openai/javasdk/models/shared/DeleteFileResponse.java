/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteFileResponse - OK
 */
public class DeleteFileResponse {
    @JsonProperty("deleted")
    public Boolean deleted;
    public DeleteFileResponse withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public DeleteFileResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public DeleteFileResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
}
