package openai.javasdk.models.operations;



public class ListFineTuneEventsResponse {
    public String contentType;
    public ListFineTuneEventsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public openai.javasdk.models.shared.ListFineTuneEventsResponse listFineTuneEventsResponse;
    public ListFineTuneEventsResponse withListFineTuneEventsResponse(openai.javasdk.models.shared.ListFineTuneEventsResponse listFineTuneEventsResponse) {
        this.listFineTuneEventsResponse = listFineTuneEventsResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListFineTuneEventsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
