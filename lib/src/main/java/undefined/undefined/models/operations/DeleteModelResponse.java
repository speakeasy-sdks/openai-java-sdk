package undefined.undefined.models.operations;



public class DeleteModelResponse {
    public String contentType;
    public DeleteModelResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public undefined.undefined.models.shared.DeleteModelResponse deleteModelResponse;
    public DeleteModelResponse withDeleteModelResponse(undefined.undefined.models.shared.DeleteModelResponse deleteModelResponse) {
        this.deleteModelResponse = deleteModelResponse;
        return this;
    }
    
    public Integer statusCode;
    public DeleteModelResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
