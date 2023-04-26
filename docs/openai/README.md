# openAI

## Overview

The OpenAI REST API

### Available Operations

* [cancelFineTune](#cancelfinetune) - Immediately cancel a fine-tune job.

* [createAnswer](#createanswer) - Answers the specified question using the provided documents and examples.

The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions).

* [createChatCompletion](#createchatcompletion) - Creates a completion for the chat message
* [createClassification](#createclassification) - Classifies the specified `query` using provided examples.

The endpoint first [searches](/docs/api-reference/searches) over the labeled examples
to select the ones most relevant for the particular query. Then, the relevant examples
are combined with the query to construct a prompt to produce the final label via the
[completions](/docs/api-reference/completions) endpoint.

Labeled examples can be provided via an uploaded `file`, or explicitly listed in the
request using the `examples` parameter for quick tests and small scale use cases.

* [createCompletion](#createcompletion) - Creates a completion for the provided prompt and parameters
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
* [createSearch](#createsearch) - The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.

To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When `file` is set, the search endpoint searches over all the documents in the given file and returns up to the `max_rerank` number of documents. These documents will be returned along with their search scores.

The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query.

* [createTranscription](#createtranscription) - Transcribes audio into the input language.
* [createTranslation](#createtranslation) - Translates audio into into English.
* [deleteFile](#deletefile) - Delete a file.
* [deleteModel](#deletemodel) - Delete a fine-tuned model. You must have the Owner role in your organization.
* [downloadFile](#downloadfile) - Returns the contents of the specified file
* [listEngines](#listengines) - Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.
* [listFiles](#listfiles) - Returns a list of files that belong to the user's organization.
* [listFineTuneEvents](#listfinetuneevents) - Get fine-grained status updates for a fine-tune job.

* [listFineTunes](#listfinetunes) - List your organization's fine-tuning jobs

* [listModels](#listmodels) - Lists the currently available models, and provides basic information about each one such as the owner and availability.
* [retrieveEngine](#retrieveengine) - Retrieves a model instance, providing basic information about it such as the owner and availability.
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

## createAnswer

Answers the specified question using the provided documents and examples.

The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions).


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
                temperature = 3373.96;
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

## createChatCompletion

Creates a completion for the chat message

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateChatCompletionResponse;
import openai.javasdk.models.shared.ChatCompletionRequestMessage;
import openai.javasdk.models.shared.ChatCompletionRequestMessageRoleEnum;
import openai.javasdk.models.shared.CreateChatCompletionRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateChatCompletionRequest req = new CreateChatCompletionRequest(                new openai.javasdk.models.shared.ChatCompletionRequestMessage[]{{
                                add(new ChatCompletionRequestMessage("at", ChatCompletionRequestMessageRoleEnum.ASSISTANT) {{
                                    content = "perferendis";
                                    name = "Estelle Will";
                                    role = ChatCompletionRequestMessageRoleEnum.ASSISTANT;
                                }}),
                                add(new ChatCompletionRequestMessage("dicta", ChatCompletionRequestMessageRoleEnum.ASSISTANT) {{
                                    content = "molestiae";
                                    name = "Forrest Koepp";
                                    role = ChatCompletionRequestMessageRoleEnum.ASSISTANT;
                                }}),
                                add(new ChatCompletionRequestMessage("beatae", ChatCompletionRequestMessageRoleEnum.USER) {{
                                    content = "officia";
                                    name = "Wayne Lind";
                                    role = ChatCompletionRequestMessageRoleEnum.USER;
                                }}),
                            }}, "molestiae") {{
                frequencyPenalty = 2645.55;
                logitBias = new java.util.HashMap<String, Object>() {{
                    put("impedit", "cum");
                }};
                maxTokens = 456150L;
                n = 1L;
                presencePenalty = 2165.5;
                stop = new String[]{{
                    add("perferendis"),
                }};
                stream = false;
                temperature = 1;
                topP = 1;
                user = "ad";
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

## createClassification

Classifies the specified `query` using provided examples.

The endpoint first [searches](/docs/api-reference/searches) over the labeled examples
to select the ones most relevant for the particular query. Then, the relevant examples
are combined with the query to construct a prompt to produce the final label via the
[completions](/docs/api-reference/completions) endpoint.

Labeled examples can be provided via an uploaded `file`, or explicitly listed in the
request using the `examples` parameter for quick tests and small scale use cases.


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

            openai.javasdk.models.shared.CreateClassificationRequest req = new CreateClassificationRequest("natus", "The plot is not very attractive.") {{
                examples = new String[][]{{
                    add(new String[]{{
                        add("dolor"),
                        add("natus"),
                        add("laboriosam"),
                    }}),
                }};
                expand = "hic";
                file = "saepe";
                labels = new String[]{{
                    add("in"),
                    add("corporis"),
                    add("iste"),
                }};
                logitBias = "iure";
                logprobs = "saepe";
                maxExamples = 697631L;
                returnMetadata = "architecto";
                returnPrompt = "ipsa";
                searchModel = "reiciendis";
                temperature = 6667.67;
                user = "mollitia";
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

## createCompletion

Creates a completion for the provided prompt and parameters

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateCompletionResponse;
import openai.javasdk.models.shared.CreateCompletionRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateCompletionRequest req = new CreateCompletionRequest("laborum") {{
                bestOf = 170909L;
                echo = false;
                frequencyPenalty = 2103.82;
                logitBias = new java.util.HashMap<String, Object>() {{
                    put("explicabo", "nobis");
                    put("enim", "omnis");
                }};
                logprobs = 363711L;
                maxTokens = 16L;
                n = 1L;
                presencePenalty = 3250.47;
                prompt = new Long[]{{
                    add(438601L),
                }};
                stop = new String[]{{
                    add("["\n"]"),
                    add("["\n"]"),
                    add("["\n"]"),
                    add("["\n"]"),
                }};
                stream = false;
                suffix = "test.";
                temperature = 1;
                topP = 1;
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

            openai.javasdk.models.shared.CreateEditRequest req = new CreateEditRequest("Fix the spelling mistakes.", "sapiente") {{
                input = "What day of the wek is it?";
                n = 1L;
                temperature = 1;
                topP = 1;
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

            openai.javasdk.models.shared.CreateEmbeddingRequest req = new CreateEmbeddingRequest("This is a test.", "mollitia") {{
                user = "dolorem";
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

            openai.javasdk.models.shared.CreateFileRequest req = new CreateFileRequest(                new CreateFileRequestFile("culpa".getBytes(), "consequuntur");, "repellat");            

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
                batchSize = 653108L;
                classificationBetas = new Double[]{{
                    add(2532.91),
                    add(4143.69),
                    add(4663.11),
                }};
                classificationNClasses = 474697L;
                classificationPositiveClass = "velit";
                computeClassificationMetrics = false;
                learningRateMultiplier = 6235.1;
                model = "quia";
                nEpochs = 338007L;
                promptLossWeight = 1103.75;
                suffix = "laborum";
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

## createImage

Creates an image given a prompt.

### Example Usage

```java
package hello.world;

import openai.javasdk.Gpt;
import openai.javasdk.models.operations.CreateImageResponse;
import openai.javasdk.models.shared.CreateImageRequest;
import openai.javasdk.models.shared.CreateImageRequestResponseFormatEnum;
import openai.javasdk.models.shared.CreateImageRequestSizeEnum;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt sdk = Gpt.builder()
                .build();

            openai.javasdk.models.shared.CreateImageRequest req = new CreateImageRequest("A cute baby sea otter") {{
                n = 1L;
                responseFormat = CreateImageRequestResponseFormatEnum.URL;
                size = CreateImageRequestSizeEnum.ONE_THOUSAND_AND_TWENTY_FOURX1024;
                user = "animi";
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

            openai.javasdk.models.shared.CreateImageEditRequest req = new CreateImageEditRequest(                new CreateImageEditRequestImage("enim".getBytes(), "odit");, "A cute baby sea otter wearing a beret") {{
                mask = new CreateImageEditRequestMask("quo".getBytes(), "sequi");;
                n = "tenetur";
                responseFormat = "ipsam";
                size = "id";
                user = "possimus";
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

            openai.javasdk.models.shared.CreateImageVariationRequest req = new CreateImageVariationRequest(                new CreateImageVariationRequestImage("aut".getBytes(), "quasi");) {{
                n = "error";
                responseFormat = "temporibus";
                size = "laborum";
                user = "quasi";
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

            openai.javasdk.models.shared.CreateModerationRequest req = new CreateModerationRequest(                new String[]{{
                                add("I want to kill them."),
                                add("I want to kill them."),
                                add("I want to kill them."),
                                add("I want to kill them."),
                            }}) {{
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

## createSearch

The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.

To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When `file` is set, the search endpoint searches over all the documents in the given file and returns up to the `max_rerank` number of documents. These documents will be returned along with their search scores.

The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query.


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
                                    add("nihil"),
                                    add("praesentium"),
                                    add("voluptatibus"),
                                    add("ipsa"),
                                }};
                                file = "omnis";
                                maxRerank = 451159L;
                                returnMetadata = false;
                                user = "cum";
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

            openai.javasdk.models.shared.CreateTranscriptionRequest req = new CreateTranscriptionRequest(                new CreateTranscriptionRequestFile("perferendis".getBytes(), "doloremque");, "reprehenderit") {{
                language = "ut";
                prompt = "maiores";
                responseFormat = "dicta";
                temperature = 3594.44;
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

            openai.javasdk.models.shared.CreateTranslationRequest req = new CreateTranslationRequest(                new CreateTranslationRequestFile("dolore".getBytes(), "iusto");, "dicta") {{
                prompt = "harum";
                responseFormat = "enim";
                temperature = 8804.76;
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

            DeleteFileRequest req = new DeleteFileRequest("commodi");            

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

            DownloadFileRequest req = new DownloadFileRequest("repudiandae");            

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

## listEngines

Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.

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

## retrieveEngine

Retrieves a model instance, providing basic information about it such as the owner and availability.

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

            RetrieveFileRequest req = new RetrieveFileRequest("quae");            

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
