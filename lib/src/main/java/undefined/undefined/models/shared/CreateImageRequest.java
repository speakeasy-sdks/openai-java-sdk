package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateImageRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("n")
    public Long n;
    public CreateImageRequest withN(Long n) {
        this.n = n;
        return this;
    }
    
    @JsonProperty("prompt")
    public String prompt;
    public CreateImageRequest withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("response_format")
    public CreateImageRequestResponseFormatEnum responseFormat;
    public CreateImageRequest withResponseFormat(CreateImageRequestResponseFormatEnum responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public CreateImageRequestSizeEnum size;
    public CreateImageRequest withSize(CreateImageRequestSizeEnum size) {
        this.size = size;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public Object user;
    public CreateImageRequest withUser(Object user) {
        this.user = user;
        return this;
    }
    
}
