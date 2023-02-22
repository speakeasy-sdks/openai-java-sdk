package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class ListFineTuneEventsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=stream")
    public Boolean stream;
    public ListFineTuneEventsQueryParams withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    
}
