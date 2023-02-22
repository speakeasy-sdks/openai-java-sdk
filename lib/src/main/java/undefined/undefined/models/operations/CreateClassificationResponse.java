package undefined.undefined.models.operations;



public class CreateClassificationResponse {
    public String contentType;
    public CreateClassificationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public undefined.undefined.models.shared.CreateClassificationResponse createClassificationResponse;
    public CreateClassificationResponse withCreateClassificationResponse(undefined.undefined.models.shared.CreateClassificationResponse createClassificationResponse) {
        this.createClassificationResponse = createClassificationResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateClassificationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
