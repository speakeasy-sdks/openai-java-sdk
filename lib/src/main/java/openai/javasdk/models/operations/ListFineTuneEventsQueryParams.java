package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class ListFineTuneEventsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=stream")
    public Boolean stream;
    public ListFineTuneEventsQueryParams withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    
}
