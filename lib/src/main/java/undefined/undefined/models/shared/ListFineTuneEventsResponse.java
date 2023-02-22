package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListFineTuneEventsResponse {
    @JsonProperty("data")
    public Object[] data;
    public ListFineTuneEventsResponse withData(Object[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("object")
    public String object;
    public ListFineTuneEventsResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
}
