<!-- Start SDK Example Usage -->
```java
package hello.world;

import undefined.undefined.Companyname;
import undefined.undefined.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Companyname.Builder builder = Companyname.builder();

            Companyname sdk = builder.build();

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