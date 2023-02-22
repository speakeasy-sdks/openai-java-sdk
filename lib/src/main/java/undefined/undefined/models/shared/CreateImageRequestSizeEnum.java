package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum CreateImageRequestSizeEnum {
    TWO_HUNDRED_AND_FIFTY_SIXX256("256x256"),
    FIVE_HUNDRED_AND_TWELVEX512("512x512"),
    ONE_THOUSAND_AND_TWENTY_FOURX1024("1024x1024");

    @JsonValue
    public final String value;

    private CreateImageRequestSizeEnum(String value) {
        this.value = value;
    }
}
