package openai.javasdk.models.operations;



public class ListFineTunesResponse {
    public String contentType;
    public ListFineTunesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.ListFineTunesResponse listFineTunesResponse;
    public ListFineTunesResponse withListFineTunesResponse(openai.javasdk.models.shared.ListFineTunesResponse listFineTunesResponse) {
        this.listFineTunesResponse = listFineTunesResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListFineTunesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
