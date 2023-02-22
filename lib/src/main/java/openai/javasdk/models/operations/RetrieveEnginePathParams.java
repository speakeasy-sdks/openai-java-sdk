package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class RetrieveEnginePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=engine_id")
    public String engineId;
    public RetrieveEnginePathParams withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }
    
}
