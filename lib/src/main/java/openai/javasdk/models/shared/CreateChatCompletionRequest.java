/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateChatCompletionRequest {
    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.
     * 
     * [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("frequency_penalty")
    public Double frequencyPenalty;

    public CreateChatCompletionRequest withFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }
    
    /**
     * Controls how the model responds to function calls. "none" means the model does not call a function, and responds to the end-user. "auto" means the model can pick between an end-user or calling a function.  Specifying a particular function via `{"name":\ "my_function"}` forces the model to call that function. "none" is the default when no functions are present. "auto" is the default if functions are present.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("function_call")
    public Object functionCall;

    public CreateChatCompletionRequest withFunctionCall(Object functionCall) {
        this.functionCall = functionCall;
        return this;
    }
    
    /**
     * A list of functions the model may generate JSON inputs for.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("functions")
    public ChatCompletionFunctions[] functions;

    public CreateChatCompletionRequest withFunctions(ChatCompletionFunctions[] functions) {
        this.functions = functions;
        return this;
    }
    
    /**
     * Modify the likelihood of specified tokens appearing in the completion.
     * 
     * Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logit_bias")
    public java.util.Map<String, Long> logitBias;

    public CreateChatCompletionRequest withLogitBias(java.util.Map<String, Long> logitBias) {
        this.logitBias = logitBias;
        return this;
    }
    
    /**
     * The maximum number of [tokens](/tokenizer) to generate in the chat completion.
     * 
     * The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_tokens")
    public Long maxTokens;

    public CreateChatCompletionRequest withMaxTokens(Long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    
    /**
     * A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
     */
    @JsonProperty("messages")
    public ChatCompletionRequestMessage[] messages;

    public CreateChatCompletionRequest withMessages(ChatCompletionRequestMessage[] messages) {
        this.messages = messages;
        return this;
    }
    
    /**
     * ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
     */
    @JsonProperty("model")
    public Object model;

    public CreateChatCompletionRequest withModel(Object model) {
        this.model = model;
        return this;
    }
    
    /**
     * How many chat completion choices to generate for each input message.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("n")
    public Long n;

    public CreateChatCompletionRequest withN(Long n) {
        this.n = n;
        return this;
    }
    
    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.
     * 
     * [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("presence_penalty")
    public Double presencePenalty;

    public CreateChatCompletionRequest withPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    
    /**
     * Up to 4 sequences where the API will stop generating further tokens.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stop")
    public Object stop;

    public CreateChatCompletionRequest withStop(Object stop) {
        this.stop = stop;
        return this;
    }
    
    /**
     * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb).
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stream")
    public Boolean stream;

    public CreateChatCompletionRequest withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    
    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.
     * 
     * We generally recommend altering this or `top_p` but not both.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("temperature")
    public Double temperature;

    public CreateChatCompletionRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.
     * 
     * We generally recommend altering this or `temperature` but not both.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("top_p")
    public Double topP;

    public CreateChatCompletionRequest withTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public String user;

    public CreateChatCompletionRequest withUser(String user) {
        this.user = user;
        return this;
    }
    
    public CreateChatCompletionRequest(@JsonProperty("messages") ChatCompletionRequestMessage[] messages, @JsonProperty("model") Object model) {
        this.messages = messages;
        this.model = model;
  }
}
