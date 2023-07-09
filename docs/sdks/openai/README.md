# openAI

## Overview

The OpenAI REST API

### Available Operations

* [cancelFineTune](#cancelfinetune) - Immediately cancel a fine-tune job.

* [createChatCompletion](#createchatcompletion) - Creates a model response for the given chat conversation.
* [createCompletion](#createcompletion) - Creates a completion for the provided prompt and parameters.
* [~~createEdit~~](#createedit) - Creates a new edit for the provided input, instruction, and parameters. :warning: **Deprecated**
* [createEmbedding](#createembedding) - Creates an embedding vector representing the input text.
* [createFile](#createfile) - Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.

* [createFineTune](#createfinetune) - Creates a job that fine-tunes a specified model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)

* [createImage](#createimage) - Creates an image given a prompt.
* [createImageEdit](#createimageedit) - Creates an edited or extended image given an original image and a prompt.
* [createImageVariation](#createimagevariation) - Creates a variation of a given image.
* [createModeration](#createmoderation) - Classifies if text violates OpenAI's Content Policy
* [createTranscription](#createtranscription) - Transcribes audio into the input language.
* [createTranslation](#createtranslation) - Translates audio into English.
* [deleteFile](#deletefile) - Delete a file.
* [deleteModel](#deletemodel) - Delete a fine-tuned model. You must have the Owner role in your organization.
* [downloadFile](#downloadfile) - Returns the contents of the specified file
* [listFiles](#listfiles) - Returns a list of files that belong to the user's organization.
* [listFineTuneEvents](#listfinetuneevents) - Get fine-grained status updates for a fine-tune job.

* [listFineTunes](#listfinetunes) - List your organization's fine-tuning jobs

* [listModels](#listmodels) - Lists the currently available models, and provides basic information about each one such as the owner and availability.
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
import openai.javasdk.models.shared.CreateChatCompletionRequestModel2;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateChatCompletionRequest req = new CreateChatCompletionRequest(                new openai.javasdk.models.shared.ChatCompletionRequestMessage[]{{
                                add(new ChatCompletionRequestMessage("delectus", ChatCompletionRequestMessageRole.USER) {{
                                    content = "provident";
                                    functionCall = new ChatCompletionRequestMessageFunctionCall("vel", "error") {{
                                        arguments = "distinctio";
                                        name = "Stuart Stiedemann";
                                    }};
                                    name = "Rick Kertzmann";
                                    role = ChatCompletionRequestMessageRole.SYSTEM;
                                }}),
                                add(new ChatCompletionRequestMessage("sapiente", ChatCompletionRequestMessageRole.FUNCTION) {{
                                    content = "suscipit";
                                    functionCall = new ChatCompletionRequestMessageFunctionCall("nisi", "recusandae") {{
                                        arguments = "molestiae";
                                        name = "Irving Lehner";
                                    }};
                                    name = "Miss Raymond Hauck III";
                                    role = ChatCompletionRequestMessageRole.FUNCTION;
                                }}),
                                add(new ChatCompletionRequestMessage("fugit", ChatCompletionRequestMessageRole.ASSISTANT) {{
                                    content = "odit";
                                    functionCall = new ChatCompletionRequestMessageFunctionCall("esse", "totam") {{
                                        arguments = "at";
                                        name = "Emilio Krajcik";
                                    }};
                                    name = "Omar Carroll";
                                    role = ChatCompletionRequestMessageRole.ASSISTANT;
                                }}),
                            }}, CreateChatCompletionRequestModel2.GPT35_TURBO) {{
                frequencyPenalty = 7586.16d;
                functionCall = new CreateChatCompletionRequestFunctionCall2("beatae");;
                functions = new openai.javasdk.models.shared.ChatCompletionFunctions[]{{
                    add(new ChatCompletionFunctions("perferendis",                 new java.util.HashMap<String, Object>() {{
                                        put("natus", "sed");
                                        put("iste", "dolor");
                                    }}) {{
                        description = "molestiae";
                        name = "Norma Ryan";
                        parameters = new java.util.HashMap<String, Object>() {{
                            put("excepturi", "aspernatur");
                        }};
                    }}),
                    add(new ChatCompletionFunctions("architecto",                 new java.util.HashMap<String, Object>() {{
                                        put("reiciendis", "est");
                                    }}) {{
                        description = "natus";
                        name = "May Turcotte";
                        parameters = new java.util.HashMap<String, Object>() {{
                            put("iste", "iure");
                            put("saepe", "quidem");
                        }};
                    }}),
                }};
                logitBias = new java.util.HashMap<String, Long>() {{
                    put("laborum", 170909L);
                    put("dolorem", 358152L);
                    put("explicabo", 750686L);
                }};
                maxTokens = 315428L;
                n = 1L;
                presencePenalty = 6078.31d;
                stop = "minima";
                stream = false;
                temperature = 1d;
                topP = 1d;
                user = "excepturi";
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


## createCompletion

Creates a completion for the provided prompt and parameters.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateCompletionResponse;
import openai.javasdk.models.shared.CreateCompletionRequest;
import openai.javasdk.models.shared.CreateCompletionRequestModel2;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateCompletionRequest req = new CreateCompletionRequest("iure",                 new Long[]{{
                                add(958950L),
                                add(102044L),
                                add(652790L),
                                add(208876L),
                            }}) {{
                bestOf = 635059L;
                echo = false;
                frequencyPenalty = 1613.09d;
                logitBias = new java.util.HashMap<String, Long>() {{
                    put("mollitia", 581850L);
                    put("numquam", 414369L);
                    put("quam", 474697L);
                    put("velit", 623510L);
                }};
                logprobs = 158969L;
                maxTokens = 16L;
                n = 1L;
                presencePenalty = 3380.07d;
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


## ~~createEdit~~

Creates a new edit for the provided input, instruction, and parameters.

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateEditResponse;
import openai.javasdk.models.shared.CreateEditRequest;
import openai.javasdk.models.shared.CreateEditRequestModel2;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateEditRequest req = new CreateEditRequest("Fix the spelling mistakes.", CreateEditRequestModel2.TEXT_DAVINCI_EDIT001) {{
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
import openai.javasdk.models.shared.CreateEmbeddingRequestModel2;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateEmbeddingRequest req = new CreateEmbeddingRequest(                new Long[]{{
                                add(138183L),
                                add(778346L),
                            }}, "text-embedding-ada-002") {{
                user = "tenetur";
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

            openai.javasdk.models.shared.CreateFileRequest req = new CreateFileRequest(                new CreateFileRequestFile("ipsam".getBytes(), "id");, "possimus");            

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
import openai.javasdk.models.shared.CreateFineTuneRequestModel2;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateFineTuneRequest req = new CreateFineTuneRequest("file-ajSREls59WBbvgSzJSVWxMCB") {{
                batchSize = 13571L;
                classificationBetas = new Double[]{{
                    add(6228.46d),
                }};
                classificationNClasses = 837945L;
                classificationPositiveClass = "laborum";
                computeClassificationMetrics = false;
                learningRateMultiplier = 960.98d;
                model = CreateFineTuneRequestModel2.CURIE;
                nEpochs = 976460L;
                promptLossWeight = 8781.94d;
                suffix = "nihil";
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
                user = "praesentium";
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

            openai.javasdk.models.shared.CreateImageEditRequest req = new CreateImageEditRequest(                new CreateImageEditRequestImage("voluptatibus".getBytes(), "ipsa");, "A cute baby sea otter wearing a beret") {{
                mask = new CreateImageEditRequestMask("omnis".getBytes(), "voluptate");;
                n = "cum";
                responseFormat = "perferendis";
                size = "doloremque";
                user = "reprehenderit";
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

            openai.javasdk.models.shared.CreateImageVariationRequest req = new CreateImageVariationRequest(                new CreateImageVariationRequestImage("ut".getBytes(), "maiores");) {{
                n = "dicta";
                responseFormat = "corporis";
                size = "dolore";
                user = "iusto";
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
import openai.javasdk.models.shared.CreateModerationRequestModel2;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateModerationRequest req = new CreateModerationRequest("I want to kill them.") {{
                model = CreateModerationRequestModel2.TEXT_MODERATION_STABLE;
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


## createTranscription

Transcribes audio into the input language.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateTranscriptionResponse;
import openai.javasdk.models.shared.CreateTranscriptionRequest;
import openai.javasdk.models.shared.CreateTranscriptionRequestFile;
import openai.javasdk.models.shared.CreateTranscriptionRequestModel2;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateTranscriptionRequest req = new CreateTranscriptionRequest(                new CreateTranscriptionRequestFile("enim".getBytes(), "accusamus");, "whisper-1") {{
                language = "repudiandae";
                prompt = "quae";
                responseFormat = "ipsum";
                temperature = 6924.72d;
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

Translates audio into English.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateTranslationResponse;
import openai.javasdk.models.shared.CreateTranslationRequest;
import openai.javasdk.models.shared.CreateTranslationRequestFile;
import openai.javasdk.models.shared.CreateTranslationRequestModel2;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateTranslationRequest req = new CreateTranslationRequest(                new CreateTranslationRequestFile("molestias".getBytes(), "excepturi");, CreateTranslationRequestModel2.WHISPER1) {{
                prompt = "modi";
                responseFormat = "praesentium";
                temperature = 5232.48d;
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

            DeleteFileRequest req = new DeleteFileRequest("voluptates");            

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

            DownloadFileRequest req = new DownloadFileRequest("quasi");            

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

            RetrieveFileRequest req = new RetrieveFileRequest("repudiandae");            

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

