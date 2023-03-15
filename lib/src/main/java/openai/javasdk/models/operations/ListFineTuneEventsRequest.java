package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class ListFineTuneEventsRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fine_tune_id")
    public String fineTuneId;
    public ListFineTuneEventsRequest withFineTuneId(String fineTuneId) {
        this.fineTuneId = fineTuneId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=stream")
    public Boolean stream;
    public ListFineTuneEventsRequest withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    
}
