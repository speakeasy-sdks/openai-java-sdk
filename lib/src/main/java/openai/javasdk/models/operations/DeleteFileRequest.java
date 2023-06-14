/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import openai.javasdk.utils.SpeakeasyMetadata;


public class DeleteFileRequest {
    /**
     * The ID of the file to use for this request
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;

    public DeleteFileRequest withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    
    public DeleteFileRequest(@JsonProperty("file_id") String fileId) {
        this.fileId = fileId;
  }
}
