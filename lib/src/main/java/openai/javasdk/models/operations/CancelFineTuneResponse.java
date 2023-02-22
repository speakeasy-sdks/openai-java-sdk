package openai.javasdk.models.operations;



public class CancelFineTuneResponse {
    public String contentType;
    public CancelFineTuneResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object fineTune;
    public CancelFineTuneResponse withFineTune(Object fineTune) {
        this.fineTune = fineTune;
        return this;
    }
    
    public Integer statusCode;
    public CancelFineTuneResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
