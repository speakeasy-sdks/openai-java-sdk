package openai.javasdk.models.operations;



public class CreateSearchResponse {
    public String contentType;
    public CreateSearchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateSearchResponse createSearchResponse;
    public CreateSearchResponse withCreateSearchResponse(openai.javasdk.models.shared.CreateSearchResponse createSearchResponse) {
        this.createSearchResponse = createSearchResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateSearchResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
