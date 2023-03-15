package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class RetrieveModelRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=model")
    public String model;
    public RetrieveModelRequest withModel(String model) {
        this.model = model;
        return this;
    }
    
}
