package undefined.undefined.models.operations;

import undefined.undefined.utils.SpeakeasyMetadata;

public class DownloadFilePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public DownloadFilePathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    
}
