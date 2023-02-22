package undefined.undefined.models.operations;



public class CreateImageResponse {
    public String contentType;
    public CreateImageResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object imagesResponse;
    public CreateImageResponse withImagesResponse(Object imagesResponse) {
        this.imagesResponse = imagesResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateImageResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
