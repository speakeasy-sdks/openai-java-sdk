package undefined.undefined.models.operations;



public class RetrieveEngineResponse {
    public String contentType;
    public RetrieveEngineResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Object engine;
    public RetrieveEngineResponse withEngine(Object engine) {
        this.engine = engine;
        return this;
    }
    
    public Integer statusCode;
    public RetrieveEngineResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
