/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateEditRequest {
    /**
     * The input text to use as a starting point for the edit.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("input")
    public String input;

    public CreateEditRequest withInput(String input) {
        this.input = input;
        return this;
    }
    
    /**
     * The instruction that tells the model how to edit the prompt.
     */
    @JsonProperty("instruction")
    public String instruction;

    public CreateEditRequest withInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    
    /**
     * ID of the model to use. You can use the `text-davinci-edit-001` or `code-davinci-edit-001` model with this endpoint.
     */
    @JsonProperty("model")
    public Object model;

    public CreateEditRequest withModel(Object model) {
        this.model = model;
        return this;
    }
    
    /**
     * How many edits to generate for the input and instruction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("n")
    public Long n;

    public CreateEditRequest withN(Long n) {
        this.n = n;
        return this;
    }
    
    /**
     * completions_temperature_description
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("temperature")
    public Double temperature;

    public CreateEditRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
    /**
     * completions_top_p_description
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("top_p")
    public Double topP;

    public CreateEditRequest withTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    
    public CreateEditRequest(@JsonProperty("instruction") String instruction, @JsonProperty("model") Object model) {
        this.instruction = instruction;
        this.model = model;
  }
}
