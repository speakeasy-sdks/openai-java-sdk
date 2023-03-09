<!-- Start SDK Example Usage -->
```java
package hello.world;

import openai.javasdk.Gpt;

import openai.javasdk.models.operations.CancelFineTunePathParams;
import openai.javasdk.models.operations.CancelFineTuneRequest;
import openai.javasdk.models.operations.CancelFineTuneResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Gpt.Builder builder = Gpt.builder();

            Gpt sdk = builder.build();

            CancelFineTuneRequest req = new CancelFineTuneRequest() {{
                pathParams = new CancelFineTunePathParams() {{
                    fineTuneId = "unde";
                }};
            }};

            CancelFineTuneResponse res = sdk.openAI.cancelFineTune(req);

            if (res.fineTune.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->