package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateEditRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("input")
    public String input;
    public CreateEditRequest withInput(String input) {
        this.input = input;
        return this;
    }
    
    @JsonProperty("instruction")
    public String instruction;
    public CreateEditRequest withInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    
    @JsonProperty("model")
    public Object model;
    public CreateEditRequest withModel(Object model) {
        this.model = model;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("n")
    public Long n;
    public CreateEditRequest withN(Long n) {
        this.n = n;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("temperature")
    public Double temperature;
    public CreateEditRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("top_p")
    public Double topP;
    public CreateEditRequest withTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    
}
