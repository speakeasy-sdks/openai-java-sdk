package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListFilesResponse {
    @JsonProperty("data")
    public Object[] data;
    public ListFilesResponse withData(Object[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public ListFilesResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
}
