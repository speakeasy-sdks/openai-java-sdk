package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListFineTunesResponse {
    @JsonProperty("data")
    public Object[] data;
    public ListFineTunesResponse withData(Object[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public ListFineTunesResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
}
