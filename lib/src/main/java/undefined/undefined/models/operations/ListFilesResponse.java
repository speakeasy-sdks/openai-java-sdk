package undefined.undefined.models.operations;



public class ListFilesResponse {
    public String contentType;
    public ListFilesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public undefined.undefined.models.shared.ListFilesResponse listFilesResponse;
    public ListFilesResponse withListFilesResponse(undefined.undefined.models.shared.ListFilesResponse listFilesResponse) {
        this.listFilesResponse = listFilesResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListFilesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
