package undefined.undefined.models.operations;



public class DeleteFileResponse {
    public String contentType;
    public DeleteFileResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public undefined.undefined.models.shared.DeleteFileResponse deleteFileResponse;
    public DeleteFileResponse withDeleteFileResponse(undefined.undefined.models.shared.DeleteFileResponse deleteFileResponse) {
        this.deleteFileResponse = deleteFileResponse;
        return this;
    }
    
    public Integer statusCode;
    public DeleteFileResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
