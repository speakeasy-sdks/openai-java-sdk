# openAI

## Overview

The OpenAI REST API

### Available Operations

* [cancelFineTune](#cancelfinetune) - Immediately cancel a fine-tune job.

* [~~createAnswer~~](#createanswer) - Answers the specified question using the provided documents and examples.

The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions).
 :warning: **Deprecated**
* [createChatCompletion](#createchatcompletion) - Creates a model response for the given chat conversation.
* [~~createClassification~~](#createclassification) - Classifies the specified `query` using provided examples.

The endpoint first [searches](/docs/api-reference/searches) over the labeled examples
to select the ones most relevant for the particular query. Then, the relevant examples
are combined with the query to construct a prompt to produce the final label via the
[completions](/docs/api-reference/completions) endpoint.

Labeled examples can be provided via an uploaded `file`, or explicitly listed in the
request using the `examples` parameter for quick tests and small scale use cases.
 :warning: **Deprecated**
* [createCompletion](#createcompletion) - Creates a completion for the provided prompt and parameters.
* [createEdit](#createedit) - Creates a new edit for the provided input, instruction, and parameters.
* [createEmbedding](#createembedding) - Creates an embedding vector representing the input text.
* [createFile](#createfile) - Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.

* [createFineTune](#createfinetune) - Creates a job that fine-tunes a specified model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)

* [createImage](#createimage) - Creates an image given a prompt.
* [createImageEdit](#createimageedit) - Creates an edited or extended image given an original image and a prompt.
* [createImageVariation](#createimagevariation) - Creates a variation of a given image.
* [createModeration](#createmoderation) - Classifies if text violates OpenAI's Content Policy
* [~~createSearch~~](#createsearch) - The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.

To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When `file` is set, the search endpoint searches over all the documents in the given file and returns up to the `max_rerank` number of documents. These documents will be returned along with their search scores.

The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query.
 :warning: **Deprecated**
* [createTranscription](#createtranscription) - Transcribes audio into the input language.
* [createTranslation](#createtranslation) - Translates audio into into English.
* [deleteFile](#deletefile) - Delete a file.
* [deleteModel](#deletemodel) - Delete a fine-tuned model. You must have the Owner role in your organization.
* [downloadFile](#downloadfile) - Returns the contents of the specified file
* [~~listEngines~~](#listengines) - Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability. :warning: **Deprecated**
* [listFiles](#listfiles) - Returns a list of files that belong to the user's organization.
* [listFineTuneEvents](#listfinetuneevents) - Get fine-grained status updates for a fine-tune job.

* [listFineTunes](#listfinetunes) - List your organization's fine-tuning jobs

* [listModels](#listmodels) - Lists the currently available models, and provides basic information about each one such as the owner and availability.
* [~~retrieveEngine~~](#retrieveengine) - Retrieves a model instance, providing basic information about it such as the owner and availability. :warning: **Deprecated**
* [retrieveFile](#retrievefile) - Returns information about a specific file.
* [retrieveFineTune](#retrievefinetune) - Gets info about the fine-tune job.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)

* [retrieveModel](#retrievemodel) - Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

## cancelFineTune

Immediately cancel a fine-tune job.


### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CancelFineTuneRequest;
import openai.javasdk.models.operations.CancelFineTuneResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            CancelFineTuneRequest req = new CancelFineTuneRequest("ft-AF1WoRqd3aJAHsqc9NY7iL8F");            

            CancelFineTuneResponse res = sdk.openAI.cancelFineTune(req);

            if (res.fineTune != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [openai.javasdk.models.operations.CancelFineTuneRequest](../../models/operations/CancelFineTuneRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[openai.javasdk.models.operations.CancelFineTuneResponse](../../models/operations/CancelFineTuneResponse.md)**


## ~~createAnswer~~

Answers the specified question using the provided documents and examples.

The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions).


> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateAnswerResponse;
import openai.javasdk.models.shared.CreateAnswerRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateAnswerRequest req = new CreateAnswerRequest(                new String[][]{{
                                add(new String[]{{
                                    add("distinctio"),
                                    add("quibusdam"),
                                    add("unde"),
                                }}),
                                add(new String[]{{
                                    add("corrupti"),
                                    add("illum"),
                                    add("vel"),
                                    add("error"),
                                }}),
                                add(new String[]{{
                                    add("suscipit"),
                                    add("iure"),
                                    add("magnam"),
                                }}),
                            }}, "Ottawa, Canada's capital, is located in the east of southern Ontario, near the city of Montréal and the U.S. border.", "debitis", "What is the capital of Japan?") {{
                documents = new String[]{{
                    add("delectus"),
                }};
                expand = new Object[]{{
                    add("suscipit"),
                    add("molestiae"),
                }};
                file = "minus";
                logitBias = "placeat";
                logprobs = 528895L;
                maxRerank = 479977L;
                maxTokens = 568045L;
                n = 392785L;
                returnMetadata = "recusandae";
                returnPrompt = false;
                searchModel = "temporibus";
                stop = "
            ";
                temperature = 3373.96d;
                user = "veritatis";
            }};            

            CreateAnswerResponse res = sdk.openAI.createAnswer(req);

            if (res.createAnswerResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [openai.javasdk.models.shared.CreateAnswerRequest](../../models/shared/CreateAnswerRequest.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[openai.javasdk.models.operations.CreateAnswerResponse](../../models/operations/CreateAnswerResponse.md)**


## createChatCompletion

Creates a model response for the given chat conversation.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateChatCompletionResponse;
import openai.javasdk.models.shared.ChatCompletionFunctions;
import openai.javasdk.models.shared.ChatCompletionRequestMessage;
import openai.javasdk.models.shared.ChatCompletionRequestMessageFunctionCall;
import openai.javasdk.models.shared.ChatCompletionRequestMessageRole;
import openai.javasdk.models.shared.CreateChatCompletionRequest;
import openai.javasdk.models.shared.CreateChatCompletionRequestFunctionCall1;
import openai.javasdk.models.shared.CreateChatCompletionRequestFunctionCall2;
import openai.javasdk.models.shared.CreateChatCompletionRequestLogitBias;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateChatCompletionRequest req = new CreateChatCompletionRequest(                new openai.javasdk.models.shared.ChatCompletionRequestMessage[]{{
                                add(new ChatCompletionRequestMessage(ChatCompletionRequestMessageRole.ASSISTANT) {{
                                    content = "perferendis";
                                    functionCall = new ChatCompletionRequestMessageFunctionCall() {{
                                        arguments = "ipsam";
                                        name = "Timmy Satterfield";
                                    }};
                                    name = "Emilio Krajcik";
                                    role = ChatCompletionRequestMessageRole.USER;
                                }}),
                                add(new ChatCompletionRequestMessage(ChatCompletionRequestMessageRole.USER) {{
                                    content = "porro";
                                    functionCall = new ChatCompletionRequestMessageFunctionCall() {{
                                        arguments = "dolorum";
                                        name = "Antoinette Nikolaus";
                                    }};
                                    name = "Irvin Rosenbaum III";
                                    role = ChatCompletionRequestMessageRole.USER;
                                }}),
                                add(new ChatCompletionRequestMessage(ChatCompletionRequestMessageRole.ASSISTANT) {{
                                    content = "qui";
                                    functionCall = new ChatCompletionRequestMessageFunctionCall() {{
                                        arguments = "impedit";
                                        name = "Cory Emmerich";
                                    }};
                                    name = "Cathy Mosciski";
                                    role = ChatCompletionRequestMessageRole.SYSTEM;
                                }}),
                            }}, "laboriosam") {{
                frequencyPenalty = 9437.49d;
                functionCall = new CreateChatCompletionRequestFunctionCall2("fuga");;
                functions = new openai.javasdk.models.shared.ChatCompletionFunctions[]{{
                    add(new ChatCompletionFunctions("enim") {{
                        description = "corporis";
                        name = "Brad Turcotte Jr.";
                        parameters = new java.util.HashMap<String, Object>() {{
                            put("est", "mollitia");
                            put("laborum", "dolores");
                            put("dolorem", "corporis");
                            put("explicabo", "nobis");
                        }};
                    }}),
                    add(new ChatCompletionFunctions("occaecati") {{
                        description = "omnis";
                        name = "Ms. Cathy Marks";
                        parameters = new java.util.HashMap<String, Object>() {{
                            put("sapiente", "architecto");
                            put("mollitia", "dolorem");
                            put("culpa", "consequuntur");
                            put("repellat", "mollitia");
                        }};
                    }}),
                }};
                logitBias = new CreateChatCompletionRequestLogitBias();;
                maxTokens = 253291L;
                n = 1L;
                presencePenalty = 4143.69d;
                stop = "molestiae";
                stream = false;
                temperature = 1d;
                topP = 1d;
                user = "velit";
            }};            

            CreateChatCompletionResponse res = sdk.openAI.createChatCompletion(req);

            if (res.createChatCompletionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [openai.javasdk.models.shared.CreateChatCompletionRequest](../../models/shared/CreateChatCompletionRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[openai.javasdk.models.operations.CreateChatCompletionResponse](../../models/operations/CreateChatCompletionResponse.md)**


## ~~createClassification~~

Classifies the specified `query` using provided examples.

The endpoint first [searches](/docs/api-reference/searches) over the labeled examples
to select the ones most relevant for the particular query. Then, the relevant examples
are combined with the query to construct a prompt to produce the final label via the
[completions](/docs/api-reference/completions) endpoint.

Labeled examples can be provided via an uploaded `file`, or explicitly listed in the
request using the `examples` parameter for quick tests and small scale use cases.


> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateClassificationResponse;
import openai.javasdk.models.shared.CreateClassificationRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateClassificationRequest req = new CreateClassificationRequest("error", "The plot is not very attractive.") {{
                examples = new String[][]{{
                    add(new String[]{{
                        add("vitae"),
                        add("laborum"),
                    }}),
                }};
                expand = "animi";
                file = "enim";
                labels = new String[]{{
                    add("quo"),
                }};
                logitBias = "sequi";
                logprobs = "tenetur";
                maxExamples = 368725L;
                returnMetadata = "id";
                returnPrompt = "possimus";
                searchModel = "aut";
                temperature = 0d;
                user = "quasi";
            }};            

            CreateClassificationResponse res = sdk.openAI.createClassification(req);

            if (res.createClassificationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [openai.javasdk.models.shared.CreateClassificationRequest](../../models/shared/CreateClassificationRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[openai.javasdk.models.operations.CreateClassificationResponse](../../models/operations/CreateClassificationResponse.md)**


## createCompletion

Creates a completion for the provided prompt and parameters.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateCompletionResponse;
import openai.javasdk.models.shared.CreateCompletionRequest;
import openai.javasdk.models.shared.CreateCompletionRequestLogitBias;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateCompletionRequest req = new CreateCompletionRequest("error") {{
                bestOf = 837945L;
                echo = false;
                frequencyPenalty = 6736.6d;
                logitBias = new CreateCompletionRequestLogitBias();;
                logprobs = 96098L;
                maxTokens = 16L;
                n = 1L;
                presencePenalty = 9719.45d;
                prompt = new Long[][]{{
                    add(new Long[]{{
                        add(509624L),
                        add(976762L),
                    }}),
                    add(new Long[]{{
                        add(604846L),
                    }}),
                    add(new Long[]{{
                        add(739264L),
                        add(19987L),
                    }}),
                    add(new Long[]{{
                        add(441711L),
                    }}),
                }};
                stop = "
            ";
                stream = false;
                suffix = "test.";
                temperature = 1d;
                topP = 1d;
                user = "user-1234";
            }};            

            CreateCompletionResponse res = sdk.openAI.createCompletion(req);

            if (res.createCompletionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [openai.javasdk.models.shared.CreateCompletionRequest](../../models/shared/CreateCompletionRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[openai.javasdk.models.operations.CreateCompletionResponse](../../models/operations/CreateCompletionResponse.md)**


## createEdit

Creates a new edit for the provided input, instruction, and parameters.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateEditResponse;
import openai.javasdk.models.shared.CreateEditRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateEditRequest req = new CreateEditRequest("Fix the spelling mistakes.", "maiores") {{
                input = "What day of the wek is it?";
                n = 1L;
                temperature = 1d;
                topP = 1d;
            }};            

            CreateEditResponse res = sdk.openAI.createEdit(req);

            if (res.createEditResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `request`                                                                                  | [openai.javasdk.models.shared.CreateEditRequest](../../models/shared/CreateEditRequest.md) | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |


### Response

**[openai.javasdk.models.operations.CreateEditResponse](../../models/operations/CreateEditResponse.md)**


## createEmbedding

Creates an embedding vector representing the input text.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateEmbeddingResponse;
import openai.javasdk.models.shared.CreateEmbeddingRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateEmbeddingRequest req = new CreateEmbeddingRequest("This is a test.", "corporis") {{
                user = "dolore";
            }};            

            CreateEmbeddingResponse res = sdk.openAI.createEmbedding(req);

            if (res.createEmbeddingResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [openai.javasdk.models.shared.CreateEmbeddingRequest](../../models/shared/CreateEmbeddingRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[openai.javasdk.models.operations.CreateEmbeddingResponse](../../models/operations/CreateEmbeddingResponse.md)**


## createFile

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.


### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateFileResponse;
import openai.javasdk.models.shared.CreateFileRequest;
import openai.javasdk.models.shared.CreateFileRequestFile;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateFileRequest req = new CreateFileRequest(                new CreateFileRequestFile("iusto".getBytes(), "dicta");, "harum");            

            CreateFileResponse res = sdk.openAI.createFile(req);

            if (res.openAIFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `request`                                                                                  | [openai.javasdk.models.shared.CreateFileRequest](../../models/shared/CreateFileRequest.md) | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |


### Response

**[openai.javasdk.models.operations.CreateFileResponse](../../models/operations/CreateFileResponse.md)**


## createFineTune

Creates a job that fine-tunes a specified model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)


### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateFineTuneResponse;
import openai.javasdk.models.shared.CreateFineTuneRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateFineTuneRequest req = new CreateFineTuneRequest("file-ajSREls59WBbvgSzJSVWxMCB") {{
                batchSize = 317983L;
                classificationBetas = new Double[]{{
                    add(4142.63d),
                    add(9182.36d),
                    add(641.47d),
                    add(2168.22d),
                }};
                classificationNClasses = 692472L;
                classificationPositiveClass = "molestias";
                computeClassificationMetrics = false;
                learningRateMultiplier = 5666.02d;
                model = "pariatur";
                nEpochs = 265389L;
                promptLossWeight = 5089.69d;
                suffix = "rem";
                validationFile = "file-XjSREls59WBbvgSzJSVWxMCa";
            }};            

            CreateFineTuneResponse res = sdk.openAI.createFineTune(req);

            if (res.fineTune != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [openai.javasdk.models.shared.CreateFineTuneRequest](../../models/shared/CreateFineTuneRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[openai.javasdk.models.operations.CreateFineTuneResponse](../../models/operations/CreateFineTuneResponse.md)**


## createImage

Creates an image given a prompt.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateImageResponse;
import openai.javasdk.models.shared.CreateImageRequest;
import openai.javasdk.models.shared.CreateImageRequestResponseFormat;
import openai.javasdk.models.shared.CreateImageRequestSize;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateImageRequest req = new CreateImageRequest("A cute baby sea otter") {{
                n = 1L;
                responseFormat = CreateImageRequestResponseFormat.URL;
                size = CreateImageRequestSize.ONE_THOUSAND_AND_TWENTY_FOURX1024;
                user = "voluptates";
            }};            

            CreateImageResponse res = sdk.openAI.createImage(req);

            if (res.imagesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [openai.javasdk.models.shared.CreateImageRequest](../../models/shared/CreateImageRequest.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |


### Response

**[openai.javasdk.models.operations.CreateImageResponse](../../models/operations/CreateImageResponse.md)**


## createImageEdit

Creates an edited or extended image given an original image and a prompt.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateImageEditResponse;
import openai.javasdk.models.shared.CreateImageEditRequest;
import openai.javasdk.models.shared.CreateImageEditRequestImage;
import openai.javasdk.models.shared.CreateImageEditRequestMask;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateImageEditRequest req = new CreateImageEditRequest(                new CreateImageEditRequestImage("quasi".getBytes(), "repudiandae");, "A cute baby sea otter wearing a beret") {{
                mask = new CreateImageEditRequestMask("sint".getBytes(), "veritatis");;
                n = "itaque";
                responseFormat = "incidunt";
                size = "enim";
                user = "consequatur";
            }};            

            CreateImageEditResponse res = sdk.openAI.createImageEdit(req);

            if (res.imagesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [openai.javasdk.models.shared.CreateImageEditRequest](../../models/shared/CreateImageEditRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[openai.javasdk.models.operations.CreateImageEditResponse](../../models/operations/CreateImageEditResponse.md)**


## createImageVariation

Creates a variation of a given image.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateImageVariationResponse;
import openai.javasdk.models.shared.CreateImageVariationRequest;
import openai.javasdk.models.shared.CreateImageVariationRequestImage;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateImageVariationRequest req = new CreateImageVariationRequest(                new CreateImageVariationRequestImage("est".getBytes(), "quibusdam");) {{
                n = "explicabo";
                responseFormat = "deserunt";
                size = "distinctio";
                user = "quibusdam";
            }};            

            CreateImageVariationResponse res = sdk.openAI.createImageVariation(req);

            if (res.imagesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [openai.javasdk.models.shared.CreateImageVariationRequest](../../models/shared/CreateImageVariationRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[openai.javasdk.models.operations.CreateImageVariationResponse](../../models/operations/CreateImageVariationResponse.md)**


## createModeration

Classifies if text violates OpenAI's Content Policy

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateModerationResponse;
import openai.javasdk.models.shared.CreateModerationRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateModerationRequest req = new CreateModerationRequest("I want to kill them.") {{
                model = "text-moderation-stable";
            }};            

            CreateModerationResponse res = sdk.openAI.createModeration(req);

            if (res.createModerationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [openai.javasdk.models.shared.CreateModerationRequest](../../models/shared/CreateModerationRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[openai.javasdk.models.operations.CreateModerationResponse](../../models/operations/CreateModerationResponse.md)**


## ~~createSearch~~

The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.

To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When `file` is set, the search endpoint searches over all the documents in the given file and returns up to the `max_rerank` number of documents. These documents will be returned along with their search scores.

The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query.


> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateSearchRequest;
import openai.javasdk.models.operations.CreateSearchResponse;
import openai.javasdk.models.shared.CreateSearchRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            CreateSearchRequest req = new CreateSearchRequest(                new CreateSearchRequest("the president") {{
                                documents = new String[]{{
                                    add("qui"),
                                    add("aliquid"),
                                }};
                                file = "cupiditate";
                                maxRerank = 552822L;
                                returnMetadata = false;
                                user = "perferendis";
                            }};, "davinci");            

            CreateSearchResponse res = sdk.openAI.createSearch(req);

            if (res.createSearchResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [openai.javasdk.models.operations.CreateSearchRequest](../../models/operations/CreateSearchRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[openai.javasdk.models.operations.CreateSearchResponse](../../models/operations/CreateSearchResponse.md)**


## createTranscription

Transcribes audio into the input language.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateTranscriptionResponse;
import openai.javasdk.models.shared.CreateTranscriptionRequest;
import openai.javasdk.models.shared.CreateTranscriptionRequestFile;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateTranscriptionRequest req = new CreateTranscriptionRequest(                new CreateTranscriptionRequestFile("magni".getBytes(), "assumenda");, "ipsam") {{
                language = "alias";
                prompt = "fugit";
                responseFormat = "dolorum";
                temperature = 5696.18d;
            }};            

            CreateTranscriptionResponse res = sdk.openAI.createTranscription(req);

            if (res.createTranscriptionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [openai.javasdk.models.shared.CreateTranscriptionRequest](../../models/shared/CreateTranscriptionRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[openai.javasdk.models.operations.CreateTranscriptionResponse](../../models/operations/CreateTranscriptionResponse.md)**


## createTranslation

Translates audio into into English.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateTranslationResponse;
import openai.javasdk.models.shared.CreateTranslationRequest;
import openai.javasdk.models.shared.CreateTranslationRequestFile;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateTranslationRequest req = new CreateTranslationRequest(                new CreateTranslationRequestFile("tempora".getBytes(), "facilis");, "tempore") {{
                prompt = "labore";
                responseFormat = "delectus";
                temperature = 4332.88d;
            }};            

            CreateTranslationResponse res = sdk.openAI.createTranslation(req);

            if (res.createTranslationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [openai.javasdk.models.shared.CreateTranslationRequest](../../models/shared/CreateTranslationRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[openai.javasdk.models.operations.CreateTranslationResponse](../../models/operations/CreateTranslationResponse.md)**


## deleteFile

Delete a file.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.DeleteFileRequest;
import openai.javasdk.models.operations.DeleteFileResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            DeleteFileRequest req = new DeleteFileRequest("non");            

            DeleteFileResponse res = sdk.openAI.deleteFile(req);

            if (res.deleteFileResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [openai.javasdk.models.operations.DeleteFileRequest](../../models/operations/DeleteFileRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[openai.javasdk.models.operations.DeleteFileResponse](../../models/operations/DeleteFileResponse.md)**


## deleteModel

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.DeleteModelRequest;
import openai.javasdk.models.operations.DeleteModelResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            DeleteModelRequest req = new DeleteModelRequest("curie:ft-acmeco-2021-03-03-21-44-20");            

            DeleteModelResponse res = sdk.openAI.deleteModel(req);

            if (res.deleteModelResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [openai.javasdk.models.operations.DeleteModelRequest](../../models/operations/DeleteModelRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[openai.javasdk.models.operations.DeleteModelResponse](../../models/operations/DeleteModelResponse.md)**


## downloadFile

Returns the contents of the specified file

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.DownloadFileRequest;
import openai.javasdk.models.operations.DownloadFileResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            DownloadFileRequest req = new DownloadFileRequest("eligendi");            

            DownloadFileResponse res = sdk.openAI.downloadFile(req);

            if (res.downloadFile200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [openai.javasdk.models.operations.DownloadFileRequest](../../models/operations/DownloadFileRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[openai.javasdk.models.operations.DownloadFileResponse](../../models/operations/DownloadFileResponse.md)**


## ~~listEngines~~

Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.ListEnginesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            ListEnginesResponse res = sdk.openAI.listEngines();

            if (res.listEnginesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[openai.javasdk.models.operations.ListEnginesResponse](../../models/operations/ListEnginesResponse.md)**


## listFiles

Returns a list of files that belong to the user's organization.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.ListFilesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            ListFilesResponse res = sdk.openAI.listFiles();

            if (res.listFilesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[openai.javasdk.models.operations.ListFilesResponse](../../models/operations/ListFilesResponse.md)**


## listFineTuneEvents

Get fine-grained status updates for a fine-tune job.


### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.ListFineTuneEventsRequest;
import openai.javasdk.models.operations.ListFineTuneEventsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            ListFineTuneEventsRequest req = new ListFineTuneEventsRequest("ft-AF1WoRqd3aJAHsqc9NY7iL8F") {{
                stream = false;
            }};            

            ListFineTuneEventsResponse res = sdk.openAI.listFineTuneEvents(req);

            if (res.listFineTuneEventsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [openai.javasdk.models.operations.ListFineTuneEventsRequest](../../models/operations/ListFineTuneEventsRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[openai.javasdk.models.operations.ListFineTuneEventsResponse](../../models/operations/ListFineTuneEventsResponse.md)**


## listFineTunes

List your organization's fine-tuning jobs


### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.ListFineTunesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            ListFineTunesResponse res = sdk.openAI.listFineTunes();

            if (res.listFineTunesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[openai.javasdk.models.operations.ListFineTunesResponse](../../models/operations/ListFineTunesResponse.md)**


## listModels

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.ListModelsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            ListModelsResponse res = sdk.openAI.listModels();

            if (res.listModelsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[openai.javasdk.models.operations.ListModelsResponse](../../models/operations/ListModelsResponse.md)**


## ~~retrieveEngine~~

Retrieves a model instance, providing basic information about it such as the owner and availability.

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.RetrieveEngineRequest;
import openai.javasdk.models.operations.RetrieveEngineResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            RetrieveEngineRequest req = new RetrieveEngineRequest("davinci");            

            RetrieveEngineResponse res = sdk.openAI.retrieveEngine(req);

            if (res.engine != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [openai.javasdk.models.operations.RetrieveEngineRequest](../../models/operations/RetrieveEngineRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[openai.javasdk.models.operations.RetrieveEngineResponse](../../models/operations/RetrieveEngineResponse.md)**


## retrieveFile

Returns information about a specific file.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.RetrieveFileRequest;
import openai.javasdk.models.operations.RetrieveFileResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            RetrieveFileRequest req = new RetrieveFileRequest("sint");            

            RetrieveFileResponse res = sdk.openAI.retrieveFile(req);

            if (res.openAIFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [openai.javasdk.models.operations.RetrieveFileRequest](../../models/operations/RetrieveFileRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[openai.javasdk.models.operations.RetrieveFileResponse](../../models/operations/RetrieveFileResponse.md)**


## retrieveFineTune

Gets info about the fine-tune job.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)


### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.RetrieveFineTuneRequest;
import openai.javasdk.models.operations.RetrieveFineTuneResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            RetrieveFineTuneRequest req = new RetrieveFineTuneRequest("ft-AF1WoRqd3aJAHsqc9NY7iL8F");            

            RetrieveFineTuneResponse res = sdk.openAI.retrieveFineTune(req);

            if (res.fineTune != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [openai.javasdk.models.operations.RetrieveFineTuneRequest](../../models/operations/RetrieveFineTuneRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[openai.javasdk.models.operations.RetrieveFineTuneResponse](../../models/operations/RetrieveFineTuneResponse.md)**


## retrieveModel

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.RetrieveModelRequest;
import openai.javasdk.models.operations.RetrieveModelResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            RetrieveModelRequest req = new RetrieveModelRequest("text-davinci-001");            

            RetrieveModelResponse res = sdk.openAI.retrieveModel(req);

            if (res.model != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [openai.javasdk.models.operations.RetrieveModelRequest](../../models/operations/RetrieveModelRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[openai.javasdk.models.operations.RetrieveModelResponse](../../models/operations/RetrieveModelResponse.md)**

