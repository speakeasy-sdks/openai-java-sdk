/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import openai.javasdk.utils.SpeakeasyMetadata;

public class CreateTranslationRequestFile {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;

    public CreateTranslationRequestFile withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=file")
    public String file;

    public CreateTranslationRequestFile withFile(String file) {
        this.file = file;
        return this;
    }
    
    public CreateTranslationRequestFile(@JsonProperty("content") byte[] content, @JsonProperty("file") String file) {
        this.content = content;
        this.file = file;
  }
}
