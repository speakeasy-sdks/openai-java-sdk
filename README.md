# openai-java-sdk

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'openai.javasdk:openai-java-sdk:2.12.0'
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

* [createChatCompletion](docs/sdks/openai/README.md#createchatcompletion) - Creates a model response for the given chat conversation.
* [createCompletion](docs/sdks/openai/README.md#createcompletion) - Creates a completion for the provided prompt and parameters.
* [~~createEdit~~](docs/sdks/openai/README.md#createedit) - Creates a new edit for the provided input, instruction, and parameters. :warning: **Deprecated**
* [createEmbedding](docs/sdks/openai/README.md#createembedding) - Creates an embedding vector representing the input text.
* [createFile](docs/sdks/openai/README.md#createfile) - Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.

* [createFineTune](docs/sdks/openai/README.md#createfinetune) - Creates a job that fine-tunes a specified model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)

* [createImage](docs/sdks/openai/README.md#createimage) - Creates an image given a prompt.
* [createImageEdit](docs/sdks/openai/README.md#createimageedit) - Creates an edited or extended image given an original image and a prompt.
* [createImageVariation](docs/sdks/openai/README.md#createimagevariation) - Creates a variation of a given image.
* [createModeration](docs/sdks/openai/README.md#createmoderation) - Classifies if text violates OpenAI's Content Policy
* [createTranscription](docs/sdks/openai/README.md#createtranscription) - Transcribes audio into the input language.
* [createTranslation](docs/sdks/openai/README.md#createtranslation) - Translates audio into English.
* [deleteFile](docs/sdks/openai/README.md#deletefile) - Delete a file.
* [deleteModel](docs/sdks/openai/README.md#deletemodel) - Delete a fine-tuned model. You must have the Owner role in your organization.
* [downloadFile](docs/sdks/openai/README.md#downloadfile) - Returns the contents of the specified file
* [listFiles](docs/sdks/openai/README.md#listfiles) - Returns a list of files that belong to the user's organization.
* [listFineTuneEvents](docs/sdks/openai/README.md#listfinetuneevents) - Get fine-grained status updates for a fine-tune job.

* [listFineTunes](docs/sdks/openai/README.md#listfinetunes) - List your organization's fine-tuning jobs

* [listModels](docs/sdks/openai/README.md#listmodels) - Lists the currently available models, and provides basic information about each one such as the owner and availability.
* [retrieveFile](docs/sdks/openai/README.md#retrievefile) - Returns information about a specific file.
* [retrieveFineTune](docs/sdks/openai/README.md#retrievefinetune) - Gets info about the fine-tune job.

[Learn more about Fine-tuning](/docs/guides/fine-tuning)

* [retrieveModel](docs/sdks/openai/README.md#retrievemodel) - Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
