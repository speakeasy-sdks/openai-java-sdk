/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model - OK
 */

public class Model {
    @JsonProperty("created")
    public Long created;

    public Model withCreated(Long created) {
        this.created = created;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public Model withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("object")
    public String object;

    public Model withObject(String object) {
        this.object = object;
        return this;
    }
    
    @JsonProperty("owned_by")
    public String ownedBy;

    public Model withOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }
    
    public Model(@JsonProperty("created") Long created, @JsonProperty("id") String id, @JsonProperty("object") String object, @JsonProperty("owned_by") String ownedBy) {
        this.created = created;
        this.id = id;
        this.object = object;
        this.ownedBy = ownedBy;
  }
}
