package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    
}
