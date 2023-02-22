package undefined.undefined.models.operations;



public class CreateSearchResponse {
    public String contentType;
    public CreateSearchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public undefined.undefined.models.shared.CreateSearchResponse createSearchResponse;
    public CreateSearchResponse withCreateSearchResponse(undefined.undefined.models.shared.CreateSearchResponse createSearchResponse) {
        this.createSearchResponse = createSearchResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateSearchResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
