package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class ListFineTuneEventsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fine_tune_id")
    public String fineTuneId;
    public ListFineTuneEventsPathParams withFineTuneId(String fineTuneId) {
        this.fineTuneId = fineTuneId;
        return this;
    }
    
}
