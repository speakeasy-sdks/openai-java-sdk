package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class RetrieveFilePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public RetrieveFilePathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    
}
