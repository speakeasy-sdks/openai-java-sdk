package openai.javasdk.models.operations;



public class ListFilesResponse {
    public String contentType;
    public ListFilesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.ListFilesResponse listFilesResponse;
    public ListFilesResponse withListFilesResponse(openai.javasdk.models.shared.ListFilesResponse listFilesResponse) {
        this.listFilesResponse = listFilesResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListFilesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
