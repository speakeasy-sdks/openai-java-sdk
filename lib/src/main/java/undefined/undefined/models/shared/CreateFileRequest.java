package undefined.undefined.models.shared;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateFileRequest {
    @SpeakeasyMetadata("multipartForm:file")
    public CreateFileRequestFile file;
    public CreateFileRequest withFile(CreateFileRequestFile file) {
        this.file = file;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=purpose")
    public String purpose;
    public CreateFileRequest withPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    
}
