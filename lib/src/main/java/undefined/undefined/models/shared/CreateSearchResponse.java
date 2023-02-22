package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateSearchResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public CreateSearchResponseData[] data;
    public CreateSearchResponse withData(CreateSearchResponseData[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model")
    public String model;
    public CreateSearchResponse withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public String object;
    public CreateSearchResponse withObject(String object) {
        this.object = object;
        return this;
    }
    
}
