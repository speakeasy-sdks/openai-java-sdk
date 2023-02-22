package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListModelsResponse {
    @JsonProperty("data")
    public Object[] data;
    public ListModelsResponse withData(Object[] data) {
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
