package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateSearchPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=engine_id")
    public String engineId;
    public CreateSearchPathParams withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }
    
}
