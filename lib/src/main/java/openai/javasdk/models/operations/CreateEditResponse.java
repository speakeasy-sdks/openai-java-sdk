package openai.javasdk.models.operations;



public class CreateEditResponse {
    public String contentType;
    public CreateEditResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.CreateEditResponse createEditResponse;
    public CreateEditResponse withCreateEditResponse(openai.javasdk.models.shared.CreateEditResponse createEditResponse) {
        this.createEditResponse = createEditResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateEditResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
