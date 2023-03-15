package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class DeleteModelRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=model")
    public String model;
    public DeleteModelRequest withModel(String model) {
        this.model = model;
        return this;
    }
    
}
