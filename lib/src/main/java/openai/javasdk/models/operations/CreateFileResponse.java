package openai.javasdk.models.operations;



public class CreateFileResponse {
    public String contentType;
    public CreateFileResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object openAIFile;
    public CreateFileResponse withOpenAIFile(Object openAIFile) {
        this.openAIFile = openAIFile;
        return this;
    }
    
    public Integer statusCode;
    public CreateFileResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
