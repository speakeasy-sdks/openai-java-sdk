# openai-java-sdk

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'openai.javasdk:openai-java-sdk:1.4.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
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
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [openAI](docs/sdks/openai/README.md)

* [cancelFineTune](docs/sdks/openai/README.md#cancelfinetune) - Immediately cancel a fine-tune job.

* [~~createAnswer~~](docs/sdks/openai/README.md#createanswer) - Answers the specified question using the provided documents and examples.

The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions).
 :warning: **Deprecated**
* [createChatCompletion](docs/sdks/openai/README.md#createchatcompletion) - Creates a completion for the chat message
* [~~createClassification~~](docs/sdks/openai/README.md#createclassification) - Classifies the specified `query` using provided examples.

The endpoint first [searches](/docs/api-reference/searches) over the labeled examples
to select the ones most relevant for the particular query. Then, the relevant examples
are combined with the query to construct a prompt to produce the final label via the
[completions](/docs/api-reference/completions) endpoint.

Labeled examples can be provided via an uploaded `file`, or explicitly listed in the
request using the `examples` parameter for quick tests and small scale use cases.
 :warning: **Deprecated**
* [createCompletion](docs/sdks/openai/README.md#createcompletion) - Creates a completion for the provided prompt and parameters
* [createEdit](docs/sdks/openai/README.md#createedit) - Creates a new edit for the provided input, instruction, and parameters.
* [createEmbedding](docs/sdks/openai/README.md#createembedding) - Creates an embedding vector representing the input text.
* [createFile](docs/sdks/openai/README.md#createfile) - Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.

* [createFineTune](docs/sdks/openai/README.md#createfinetune) - Creates a job that fine-tunes a specified model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)

* [createImage](docs/sdks/openai/README.md#createimage) - Creates an image given a prompt.
* [createImageEdit](docs/sdks/openai/README.md#createimageedit) - Creates an edited or extended image given an original image and a prompt.
* [createImageVariation](docs/sdks/openai/README.md#createimagevariation) - Creates a variation of a given image.
* [createModeration](docs/sdks/openai/README.md#createmoderation) - Classifies if text violates OpenAI's Content Policy
* [~~createSearch~~](docs/sdks/openai/README.md#createsearch) - The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.

To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When `file` is set, the search endpoint searches over all the documents in the given file and returns up to the `max_rerank` number of documents. These documents will be returned along with their search scores.

The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query.
 :warning: **Deprecated**
* [createTranscription](docs/sdks/openai/README.md#createtranscription) - Transcribes audio into the input language.
* [createTranslation](docs/sdks/openai/README.md#createtranslation) - Translates audio into into English.
* [deleteFile](docs/sdks/openai/README.md#deletefile) - Delete a file.
* [deleteModel](docs/sdks/openai/README.md#deletemodel) - Delete a fine-tuned model. You must have the Owner role in your organization.
* [downloadFile](docs/sdks/openai/README.md#downloadfile) - Returns the contents of the specified file
* [~~listEngines~~](docs/sdks/openai/README.md#listengines) - Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability. :warning: **Deprecated**
* [listFiles](docs/sdks/openai/README.md#listfiles) - Returns a list of files that belong to the user's organization.
* [listFineTuneEvents](docs/sdks/openai/README.md#listfinetuneevents) - Get fine-grained status updates for a fine-tune job.

* [listFineTunes](docs/sdks/openai/README.md#listfinetunes) - List your organization's fine-tuning jobs

* [listModels](docs/sdks/openai/README.md#listmodels) - Lists the currently available models, and provides basic information about each one such as the owner and availability.
* [~~retrieveEngine~~](docs/sdks/openai/README.md#retrieveengine) - Retrieves a model instance, providing basic information about it such as the owner and availability. :warning: **Deprecated**
* [retrieveFile](docs/sdks/openai/README.md#retrievefile) - Returns information about a specific file.
* [retrieveFineTune](docs/sdks/openai/README.md#retrievefinetune) - Gets info about the fine-tune job.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)

* [retrieveModel](docs/sdks/openai/README.md#retrievemodel) - Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
