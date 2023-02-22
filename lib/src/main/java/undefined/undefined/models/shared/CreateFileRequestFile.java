package undefined.undefined.models.shared;

import undefined.undefined.utils.SpeakeasyMetadata;

public class CreateFileRequestFile {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public CreateFileRequestFile withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=file")
    public String file;
    public CreateFileRequestFile withFile(String file) {
        this.file = file;
        return this;
    }
    
}
