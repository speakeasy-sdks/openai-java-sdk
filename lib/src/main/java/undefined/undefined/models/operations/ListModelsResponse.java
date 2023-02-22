package undefined.undefined.models.operations;



public class ListModelsResponse {
    public String contentType;
    public ListModelsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public undefined.undefined.models.shared.ListModelsResponse listModelsResponse;
    public ListModelsResponse withListModelsResponse(undefined.undefined.models.shared.ListModelsResponse listModelsResponse) {
        this.listModelsResponse = listModelsResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListModelsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
