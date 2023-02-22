package undefined.undefined.models.operations;



public class CreateFineTuneResponse {
    public String contentType;
    public CreateFineTuneResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object fineTune;
    public CreateFineTuneResponse withFineTune(Object fineTune) {
        this.fineTune = fineTune;
        return this;
    }
    
    public Integer statusCode;
    public CreateFineTuneResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
