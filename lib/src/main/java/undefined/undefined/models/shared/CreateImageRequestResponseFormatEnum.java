package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum CreateImageRequestResponseFormatEnum {
    URL("url"),
    B64_JSON("b64_json");

    @JsonValue
    public final String value;

    private CreateImageRequestResponseFormatEnum(String value) {
        this.value = value;
    }
}
