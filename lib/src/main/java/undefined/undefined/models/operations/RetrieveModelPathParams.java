package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class RetrieveModelPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=model")
    public String model;
    public RetrieveModelPathParams withModel(String model) {
        this.model = model;
        return this;
    }
    
}
