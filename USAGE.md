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

            CancelFineTuneRequest req = new CancelFineTuneRequest() {{
                fineTuneId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";
            }}            

            CancelFineTuneResponse res = sdk.openAI.cancelFineTune(req);

            if (res.fineTune.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->