package undefined.undefined.models.operations;



public class ListFineTunesResponse {
    public String contentType;
    public ListFineTunesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public undefined.undefined.models.shared.ListFineTunesResponse listFineTunesResponse;
    public ListFineTunesResponse withListFineTunesResponse(undefined.undefined.models.shared.ListFineTunesResponse listFineTunesResponse) {
        this.listFineTunesResponse = listFineTunesResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListFineTunesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
