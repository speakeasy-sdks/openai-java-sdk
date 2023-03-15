package openai.javasdk.models.operations;

import openai.javasdk.utils.SpeakeasyMetadata;

public class DeleteFileRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public DeleteFileRequest withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    
}
