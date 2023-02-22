package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class RetrieveFineTunePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fine_tune_id")
    public String fineTuneId;
    public RetrieveFineTunePathParams withFineTuneId(String fineTuneId) {
        this.fineTuneId = fineTuneId;
        return this;
    }
    
}
