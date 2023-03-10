package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class RetrieveModelPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=model")
    public String model;
    public RetrieveModelPathParams withModel(String model) {
        this.model = model;
        return this;
    }
    
}
