/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateEditResponseChoices {
    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence,
     * or `length` if the maximum number of tokens specified in the request was reached.
     * 
     */
    @JsonProperty("finish_reason")
    public CreateEditResponseChoicesFinishReason finishReason;

    public CreateEditResponseChoices withFinishReason(CreateEditResponseChoicesFinishReason finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    
    /**
     * The index of the choice in the list of choices.
     */
    @JsonProperty("index")
    public Long index;

    public CreateEditResponseChoices withIndex(Long index) {
        this.index = index;
        return this;
    }
    
    /**
     * The edited result.
     */
    @JsonProperty("text")
    public String text;

    public CreateEditResponseChoices withText(String text) {
        this.text = text;
        return this;
    }
    
    public CreateEditResponseChoices(@JsonProperty("finish_reason") CreateEditResponseChoicesFinishReason finishReason, @JsonProperty("index") Long index, @JsonProperty("text") String text) {
        this.finishReason = finishReason;
        this.index = index;
        this.text = text;
  }
}
