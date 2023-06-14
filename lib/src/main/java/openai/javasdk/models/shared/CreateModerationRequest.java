/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateModerationRequest {
    /**
     * The input text to classify
     */
    @JsonProperty("input")
    public Object input;

    public CreateModerationRequest withInput(Object input) {
        this.input = input;
        return this;
    }
    
    /**
     * Two content moderations models are available: `text-moderation-stable` and `text-moderation-latest`.
     * 
     * The default is `text-moderation-latest` which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use `text-moderation-stable`, we will provide advanced notice before updating the model. Accuracy of `text-moderation-stable` may be slightly lower than for `text-moderation-latest`.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model")
    public String model;

    public CreateModerationRequest withModel(String model) {
        this.model = model;
        return this;
    }
    
    public CreateModerationRequest(@JsonProperty("input") Object input) {
        this.input = input;
  }
}
