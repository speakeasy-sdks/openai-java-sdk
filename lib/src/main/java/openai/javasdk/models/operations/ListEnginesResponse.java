package openai.javasdk.models.operations;



public class ListEnginesResponse {
    public String contentType;
    public ListEnginesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.ListEnginesResponse listEnginesResponse;
    public ListEnginesResponse withListEnginesResponse(openai.javasdk.models.shared.ListEnginesResponse listEnginesResponse) {
        this.listEnginesResponse = listEnginesResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListEnginesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
