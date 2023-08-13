/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import openai.javasdk.utils.SpeakeasyMetadata;


public class CreateTranslationRequest {
    /**
     * The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.
     * 
     */
    @SpeakeasyMetadata("multipartForm:file")
    public CreateTranslationRequestFile file;

    public CreateTranslationRequest withFile(CreateTranslationRequestFile file) {
        this.file = file;
        return this;
    }
    
    /**
     * ID of the model to use. Only `whisper-1` is currently available.
     * 
     */
    @SpeakeasyMetadata("multipartForm:name=model,json")
    public Object model;

    public CreateTranslationRequest withModel(Object model) {
        this.model = model;
        return this;
    }
    
    /**
     * An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.
     * 
     */
    @SpeakeasyMetadata("multipartForm:name=prompt")
    public String prompt;

    public CreateTranslationRequest withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    
    /**
     * The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.
     * 
     */
    @SpeakeasyMetadata("multipartForm:name=response_format")
    public String responseFormat;

    public CreateTranslationRequest withResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    
    /**
     * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.
     * 
     */
    @SpeakeasyMetadata("multipartForm:name=temperature")
    public Double temperature;

    public CreateTranslationRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
    public CreateTranslationRequest(@JsonProperty("file") CreateTranslationRequestFile file, @JsonProperty("model") Object model) {
        this.file = file;
        this.model = model;
  }
}
