/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class RetrieveEngineRequest {
    /**
     * The ID of the engine to use for this request
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=engine_id")public String engineId;
    public RetrieveEngineRequest withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }
    
}
