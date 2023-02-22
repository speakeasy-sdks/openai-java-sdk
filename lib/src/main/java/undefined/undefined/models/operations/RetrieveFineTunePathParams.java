package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class RetrieveFineTunePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fine_tune_id")
    public String fineTuneId;
    public RetrieveFineTunePathParams withFineTuneId(String fineTuneId) {
        this.fineTuneId = fineTuneId;
        return this;
    }
    
}
