package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class DeleteModelPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=model")
    public String model;
    public DeleteModelPathParams withModel(String model) {
        this.model = model;
        return this;
    }
    
}
