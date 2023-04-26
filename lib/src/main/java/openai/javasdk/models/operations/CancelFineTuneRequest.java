/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import openai.javasdk.utils.SpeakeasyMetadata;

public class CancelFineTuneRequest {
    /**
     * The ID of the fine-tune job to cancel
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fine_tune_id")
    public String fineTuneId;
    public CancelFineTuneRequest withFineTuneId(String fineTuneId) {
        this.fineTuneId = fineTuneId;
        return this;
    }
    
    public CancelFineTuneRequest(@JsonProperty("fine_tune_id") String fineTuneId) {
        this.fineTuneId = fineTuneId;
  }
}
