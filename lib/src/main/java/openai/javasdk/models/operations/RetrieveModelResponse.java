package openai.javasdk.models.operations;



public class RetrieveModelResponse {
    public String contentType;
    public RetrieveModelResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object model;
    public RetrieveModelResponse withModel(Object model) {
        this.model = model;
        return this;
    }
    
    public Integer statusCode;
    public RetrieveModelResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
