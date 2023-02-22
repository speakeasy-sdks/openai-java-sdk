package openai.javasdk.utils;

import java.lang.reflect.Field;
import java.util.Base64;

import org.apache.http.message.BasicNameValuePair;

public class Security {
    public static SpeakeasyHTTPSecurityClient createClient(HTTPClient client, Object security)
            throws Exception {

        SpeakeasyHTTPSecurityClient securityClient = new SpeakeasyHTTPSecurityClient(client);

        if (security != null) {
            Field[] fields = security.getClass().getFields();

            for (Field field : fields) {
                Object value = field.get(security);
                if (value == null) {
                    continue;
                }

                SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
                if (securityMetadata == null) {
                    continue;
                }

                if (securityMetadata.option) {
                    parseSecurityOption(securityClient, value);
                } else if (securityMetadata.scheme) {
                    parseSecurityScheme(securityClient, securityMetadata, value);
                }
            }
        }

        return securityClient;
    }

    private static void parseSecurityOption(SpeakeasyHTTPSecurityClient client, Object option)
            throws Exception {
        Field[] fields = option.getClass().getFields();

        for (Field field : fields) {
            Object value = field.get(option);

            if (value == null) {
                continue;
            }

            SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
            if (securityMetadata == null || !securityMetadata.scheme) {
                continue;
            }

            parseSecurityScheme(client, securityMetadata, value);
        }
    }

    private static void parseSecurityScheme(SpeakeasyHTTPSecurityClient client, SecurityMetadata schemeMetadata,
            Object scheme) throws Exception {
        if (schemeMetadata.type.equals("http") && schemeMetadata.subtype.equals("basic")) {
            parseBasicAuthScheme(client, scheme);
            return;
        }

        Field[] fields = scheme.getClass().getFields();

        for (Field field : fields) {
            Object value = field.get(scheme);

            if (value == null) {
                continue;
            }

            SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
            if (securityMetadata == null || securityMetadata.name.isEmpty()) {
                continue;
            }

            switch (schemeMetadata.type) {
                case "apiKey":
                    switch (schemeMetadata.subtype) {
                        case "header":
                            client.addHeader(securityMetadata.name, Utils.valToString(value));
                            break;
                        case "query":
                            client.addQueryParam(new BasicNameValuePair(securityMetadata.name, Utils.valToString(value)));
                            break;
                        case "cookie":
                            client.addHeader("Cookie",
                                    String.format("%s=%s", securityMetadata.name, Utils.valToString(value)));
                            break;
                        default:
                            throw new Error(
                                    "Unsupported security scheme subtype for apiKey: " + securityMetadata.subtype);
                    }
                    break;
                case "openIdConnect":
                    client.addHeader(securityMetadata.name, Utils.valToString(value));
                    break;
                case "oauth2":
                    client.addHeader(securityMetadata.name, Utils.valToString(value));
                    break;
                case "http":
                    switch (schemeMetadata.subtype) {
                        case "bearer":
                            client.addHeader(securityMetadata.name, Utils.valToString(value));
                            break;
                        default:
                            throw new Error("Unsupported security scheme subtype for bearer");
                    }
                    break;
                default:
                    throw new Error("Unsupported security scheme type");
            }
        }
    }

    private static void parseBasicAuthScheme(SpeakeasyHTTPSecurityClient client, Object scheme)
            throws IllegalAccessException {
        Field[] fields = scheme.getClass().getFields();

        String username = "";
        String password = "";

        for (Field field : fields) {
            Object value = field.get(scheme);

            if (value == null) {
                continue;
            }

            SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
            if (securityMetadata == null || securityMetadata.name.isEmpty()) {
                continue;
            }

            switch (securityMetadata.name) {
                case "username":
                    username = Utils.valToString(value);
                    break;
                case "password":
                    password = Utils.valToString(value);
                    break;
                default:
                    throw new Error("Unsupported security scheme field for basic auth: " + securityMetadata.name);
            }
        }

        client.addHeader("Authorization", "Basic " + Base64.getEncoder().encodeToString(String.format("%s:%s", username, password).getBytes()));
    }

    private Security() {
    }
}