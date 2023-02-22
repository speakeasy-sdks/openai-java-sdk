package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListEnginesResponse {
    @JsonProperty("data")
    public Object[] data;
    public ListEnginesResponse withData(Object[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public ListEnginesResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
}
