package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class RetrieveEngineRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=engine_id")
    public String engineId;
    public RetrieveEngineRequest withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }
    
}
