/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import java.net.http.HttpResponse;

public class CreateImageResponse {
    public String contentType;
    public CreateImageResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
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
    
    public HttpResponse<byte[]> rawResponse;
    public CreateImageResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
