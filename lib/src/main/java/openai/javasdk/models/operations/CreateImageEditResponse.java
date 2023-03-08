package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class CreateImageEditResponse {
    public String contentType;
    public CreateImageEditResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object imagesResponse;
    public CreateImageEditResponse withImagesResponse(Object imagesResponse) {
        this.imagesResponse = imagesResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateImageEditResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateImageEditResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
