/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreateChatCompletionRequestModel2 - ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
 */
public enum CreateChatCompletionRequestModel2 {
    GPT4("gpt-4"),
    GPT40613("gpt-4-0613"),
    GPT432K("gpt-4-32k"),
    GPT432K0613("gpt-4-32k-0613"),
    GPT35_TURBO("gpt-3.5-turbo"),
    GPT35_TURBO16K("gpt-3.5-turbo-16k"),
    GPT35_TURBO0613("gpt-3.5-turbo-0613"),
    GPT35_TURBO16K0613("gpt-3.5-turbo-16k-0613");

    @JsonValue
    public final String value;

    private CreateChatCompletionRequestModel2(String value) {
        this.value = value;
    }
}
