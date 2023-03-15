package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class CancelFineTuneRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fine_tune_id")
    public String fineTuneId;
    public CancelFineTuneRequest withFineTuneId(String fineTuneId) {
        this.fineTuneId = fineTuneId;
        return this;
    }
    
}
