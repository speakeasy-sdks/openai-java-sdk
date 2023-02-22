package openai.javasdk.models.operations;



public class DownloadFileResponse {
    public String contentType;
    public DownloadFileResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public DownloadFileResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public String downloadFile200ApplicationJSONString;
    public DownloadFileResponse withDownloadFile200ApplicationJSONString(String downloadFile200ApplicationJSONString) {
        this.downloadFile200ApplicationJSONString = downloadFile200ApplicationJSONString;
        return this;
    }
    
}
