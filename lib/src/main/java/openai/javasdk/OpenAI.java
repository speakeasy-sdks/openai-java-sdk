package openai.javasdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import openai.javasdk.utils.HTTPClient;
import openai.javasdk.utils.HTTPRequest;
import openai.javasdk.utils.JSON;
import openai.javasdk.utils.SerializedBody;
import org.apache.http.NameValuePair;

public class OpenAI {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public OpenAI(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * cancelFineTune - Immediately cancel a fine-tune job.
     * 
    **/
    public openai.javasdk.models.operations.CancelFineTuneResponse cancelFineTune(openai.javasdk.models.operations.CancelFineTuneRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/fine-tunes/{fine_tune_id}/cancel", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CancelFineTuneResponse res = new openai.javasdk.models.operations.CancelFineTuneResponse() {{
            fineTune = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.fineTune = out;
            }
        }

        return res;
    }
    
    /**
     * createAnswer - Answers the specified question using the provided documents and examples.
     * 
     * The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions).
     * 
    **/
    public openai.javasdk.models.operations.CreateAnswerResponse createAnswer(openai.javasdk.models.operations.CreateAnswerRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/answers");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateAnswerResponse res = new openai.javasdk.models.operations.CreateAnswerResponse() {{
            createAnswerResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.CreateAnswerResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.CreateAnswerResponse.class);
                res.createAnswerResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createChatCompletion - Creates a completion for the chat message
    **/
    public openai.javasdk.models.operations.CreateChatCompletionResponse createChatCompletion(openai.javasdk.models.operations.CreateChatCompletionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/chat/completions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateChatCompletionResponse res = new openai.javasdk.models.operations.CreateChatCompletionResponse() {{
            createChatCompletionResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.CreateChatCompletionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.CreateChatCompletionResponse.class);
                res.createChatCompletionResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createClassification - Classifies the specified `query` using provided examples.
     * 
     * The endpoint first [searches](/docs/api-reference/searches) over the labeled examples
     * to select the ones most relevant for the particular query. Then, the relevant examples
     * are combined with the query to construct a prompt to produce the final label via the
     * [completions](/docs/api-reference/completions) endpoint.
     * 
     * Labeled examples can be provided via an uploaded `file`, or explicitly listed in the
     * request using the `examples` parameter for quick tests and small scale use cases.
     * 
    **/
    public openai.javasdk.models.operations.CreateClassificationResponse createClassification(openai.javasdk.models.operations.CreateClassificationRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/classifications");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateClassificationResponse res = new openai.javasdk.models.operations.CreateClassificationResponse() {{
            createClassificationResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.CreateClassificationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.CreateClassificationResponse.class);
                res.createClassificationResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createCompletion - Creates a completion for the provided prompt and parameters
    **/
    public openai.javasdk.models.operations.CreateCompletionResponse createCompletion(openai.javasdk.models.operations.CreateCompletionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/completions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateCompletionResponse res = new openai.javasdk.models.operations.CreateCompletionResponse() {{
            createCompletionResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.CreateCompletionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.CreateCompletionResponse.class);
                res.createCompletionResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createEdit - Creates a new edit for the provided input, instruction, and parameters.
    **/
    public openai.javasdk.models.operations.CreateEditResponse createEdit(openai.javasdk.models.operations.CreateEditRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/edits");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateEditResponse res = new openai.javasdk.models.operations.CreateEditResponse() {{
            createEditResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.CreateEditResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.CreateEditResponse.class);
                res.createEditResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createEmbedding - Creates an embedding vector representing the input text.
    **/
    public openai.javasdk.models.operations.CreateEmbeddingResponse createEmbedding(openai.javasdk.models.operations.CreateEmbeddingRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/embeddings");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateEmbeddingResponse res = new openai.javasdk.models.operations.CreateEmbeddingResponse() {{
            createEmbeddingResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.CreateEmbeddingResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.CreateEmbeddingResponse.class);
                res.createEmbeddingResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createFile - Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
     * 
    **/
    public openai.javasdk.models.operations.CreateFileResponse createFile(openai.javasdk.models.operations.CreateFileRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/files");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateFileResponse res = new openai.javasdk.models.operations.CreateFileResponse() {{
            openAIFile = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.openAIFile = out;
            }
        }

        return res;
    }
    
    /**
     * createFineTune - Creates a job that fine-tunes a specified model from a given dataset.
     * 
     * Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.
     * 
     * [Learn more about Fine-tuning](/docs/guides/fine-tuning)
     * 
    **/
    public openai.javasdk.models.operations.CreateFineTuneResponse createFineTune(openai.javasdk.models.operations.CreateFineTuneRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/fine-tunes");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateFineTuneResponse res = new openai.javasdk.models.operations.CreateFineTuneResponse() {{
            fineTune = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.fineTune = out;
            }
        }

        return res;
    }
    
    /**
     * createImage - Creates an image given a prompt.
    **/
    public openai.javasdk.models.operations.CreateImageResponse createImage(openai.javasdk.models.operations.CreateImageRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/images/generations");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateImageResponse res = new openai.javasdk.models.operations.CreateImageResponse() {{
            imagesResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.imagesResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createImageEdit - Creates an edited or extended image given an original image and a prompt.
    **/
    public openai.javasdk.models.operations.CreateImageEditResponse createImageEdit(openai.javasdk.models.operations.CreateImageEditRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/images/edits");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateImageEditResponse res = new openai.javasdk.models.operations.CreateImageEditResponse() {{
            imagesResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.imagesResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createImageVariation - Creates a variation of a given image.
    **/
    public openai.javasdk.models.operations.CreateImageVariationResponse createImageVariation(openai.javasdk.models.operations.CreateImageVariationRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/images/variations");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateImageVariationResponse res = new openai.javasdk.models.operations.CreateImageVariationResponse() {{
            imagesResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.imagesResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createModeration - Classifies if text violates OpenAI's Content Policy
    **/
    public openai.javasdk.models.operations.CreateModerationResponse createModeration(openai.javasdk.models.operations.CreateModerationRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/moderations");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateModerationResponse res = new openai.javasdk.models.operations.CreateModerationResponse() {{
            createModerationResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.CreateModerationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.CreateModerationResponse.class);
                res.createModerationResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createSearch - The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.
     * 
     * To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When `file` is set, the search endpoint searches over all the documents in the given file and returns up to the `max_rerank` number of documents. These documents will be returned along with their search scores.
     * 
     * The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query.
     * 
    **/
    public openai.javasdk.models.operations.CreateSearchResponse createSearch(openai.javasdk.models.operations.CreateSearchRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/engines/{engine_id}/search", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateSearchResponse res = new openai.javasdk.models.operations.CreateSearchResponse() {{
            createSearchResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.CreateSearchResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.CreateSearchResponse.class);
                res.createSearchResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createTranscription - Transcribes audio into the input language.
    **/
    public openai.javasdk.models.operations.CreateTranscriptionResponse createTranscription(openai.javasdk.models.operations.CreateTranscriptionRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/audio/transcriptions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateTranscriptionResponse res = new openai.javasdk.models.operations.CreateTranscriptionResponse() {{
            createTranscriptionResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.CreateTranscriptionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.CreateTranscriptionResponse.class);
                res.createTranscriptionResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createTranslation - Translates audio into into English.
    **/
    public openai.javasdk.models.operations.CreateTranslationResponse createTranslation(openai.javasdk.models.operations.CreateTranslationRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/audio/translations");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = openai.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.CreateTranslationResponse res = new openai.javasdk.models.operations.CreateTranslationResponse() {{
            createTranslationResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.CreateTranslationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.CreateTranslationResponse.class);
                res.createTranslationResponse = out;
            }
        }

        return res;
    }
    
    /**
     * deleteFile - Delete a file.
    **/
    public openai.javasdk.models.operations.DeleteFileResponse deleteFile(openai.javasdk.models.operations.DeleteFileRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/files/{file_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.DeleteFileResponse res = new openai.javasdk.models.operations.DeleteFileResponse() {{
            deleteFileResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.DeleteFileResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.DeleteFileResponse.class);
                res.deleteFileResponse = out;
            }
        }

        return res;
    }
    
    /**
     * deleteModel - Delete a fine-tuned model. You must have the Owner role in your organization.
    **/
    public openai.javasdk.models.operations.DeleteModelResponse deleteModel(openai.javasdk.models.operations.DeleteModelRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/models/{model}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.DeleteModelResponse res = new openai.javasdk.models.operations.DeleteModelResponse() {{
            deleteModelResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.DeleteModelResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.DeleteModelResponse.class);
                res.deleteModelResponse = out;
            }
        }

        return res;
    }
    
    /**
     * downloadFile - Returns the contents of the specified file
    **/
    public openai.javasdk.models.operations.DownloadFileResponse downloadFile(openai.javasdk.models.operations.DownloadFileRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/files/{file_id}/content", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.DownloadFileResponse res = new openai.javasdk.models.operations.DownloadFileResponse() {{
            downloadFile200ApplicationJSONString = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.downloadFile200ApplicationJSONString = out;
            }
        }

        return res;
    }
    
    /**
     * listEngines - Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.
    **/
    public openai.javasdk.models.operations.ListEnginesResponse listEngines() throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/engines");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.ListEnginesResponse res = new openai.javasdk.models.operations.ListEnginesResponse() {{
            listEnginesResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.ListEnginesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.ListEnginesResponse.class);
                res.listEnginesResponse = out;
            }
        }

        return res;
    }
    
    /**
     * listFiles - Returns a list of files that belong to the user's organization.
    **/
    public openai.javasdk.models.operations.ListFilesResponse listFiles() throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/files");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.ListFilesResponse res = new openai.javasdk.models.operations.ListFilesResponse() {{
            listFilesResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.ListFilesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.ListFilesResponse.class);
                res.listFilesResponse = out;
            }
        }

        return res;
    }
    
    /**
     * listFineTuneEvents - Get fine-grained status updates for a fine-tune job.
     * 
    **/
    public openai.javasdk.models.operations.ListFineTuneEventsResponse listFineTuneEvents(openai.javasdk.models.operations.ListFineTuneEventsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/fine-tunes/{fine_tune_id}/events", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = openai.javasdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.ListFineTuneEventsResponse res = new openai.javasdk.models.operations.ListFineTuneEventsResponse() {{
            listFineTuneEventsResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.ListFineTuneEventsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.ListFineTuneEventsResponse.class);
                res.listFineTuneEventsResponse = out;
            }
        }

        return res;
    }
    
    /**
     * listFineTunes - List your organization's fine-tuning jobs
     * 
    **/
    public openai.javasdk.models.operations.ListFineTunesResponse listFineTunes() throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/fine-tunes");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.ListFineTunesResponse res = new openai.javasdk.models.operations.ListFineTunesResponse() {{
            listFineTunesResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.ListFineTunesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.ListFineTunesResponse.class);
                res.listFineTunesResponse = out;
            }
        }

        return res;
    }
    
    /**
     * listModels - Lists the currently available models, and provides basic information about each one such as the owner and availability.
    **/
    public openai.javasdk.models.operations.ListModelsResponse listModels() throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/models");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.ListModelsResponse res = new openai.javasdk.models.operations.ListModelsResponse() {{
            listModelsResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                openai.javasdk.models.shared.ListModelsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), openai.javasdk.models.shared.ListModelsResponse.class);
                res.listModelsResponse = out;
            }
        }

        return res;
    }
    
    /**
     * retrieveEngine - Retrieves a model instance, providing basic information about it such as the owner and availability.
    **/
    public openai.javasdk.models.operations.RetrieveEngineResponse retrieveEngine(openai.javasdk.models.operations.RetrieveEngineRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/engines/{engine_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.RetrieveEngineResponse res = new openai.javasdk.models.operations.RetrieveEngineResponse() {{
            engine = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.engine = out;
            }
        }

        return res;
    }
    
    /**
     * retrieveFile - Returns information about a specific file.
    **/
    public openai.javasdk.models.operations.RetrieveFileResponse retrieveFile(openai.javasdk.models.operations.RetrieveFileRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/files/{file_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.RetrieveFileResponse res = new openai.javasdk.models.operations.RetrieveFileResponse() {{
            openAIFile = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.openAIFile = out;
            }
        }

        return res;
    }
    
    /**
     * retrieveFineTune - Gets info about the fine-tune job.
     * 
     * [Learn more about Fine-tuning](/docs/guides/fine-tuning)
     * 
    **/
    public openai.javasdk.models.operations.RetrieveFineTuneResponse retrieveFineTune(openai.javasdk.models.operations.RetrieveFineTuneRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/fine-tunes/{fine_tune_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.RetrieveFineTuneResponse res = new openai.javasdk.models.operations.RetrieveFineTuneResponse() {{
            fineTune = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.fineTune = out;
            }
        }

        return res;
    }
    
    /**
     * retrieveModel - Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    **/
    public openai.javasdk.models.operations.RetrieveModelResponse retrieveModel(openai.javasdk.models.operations.RetrieveModelRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = openai.javasdk.utils.Utils.generateURL(baseUrl, "/models/{model}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        openai.javasdk.models.operations.RetrieveModelResponse res = new openai.javasdk.models.operations.RetrieveModelResponse() {{
            model = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (openai.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.model = out;
            }
        }

        return res;
    }
}