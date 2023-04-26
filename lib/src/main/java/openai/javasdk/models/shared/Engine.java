/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Engine - OK
 */
public class Engine {
    @JsonProperty("created")
    public Long created;
    public Engine withCreated(Long created) {
        this.created = created;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public Engine withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public Engine withObject(String object) {
        this.object = object;
        return this;
    }
    
    @JsonProperty("ready")
    public Boolean ready;
    public Engine withReady(Boolean ready) {
        this.ready = ready;
        return this;
    }
    
    public Engine(@JsonProperty("created") Long created, @JsonProperty("id") String id, @JsonProperty("object") String object, @JsonProperty("ready") Boolean ready) {
        this.created = created;
        this.id = id;
        this.object = object;
        this.ready = ready;
  }
}
