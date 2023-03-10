package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateModerationResponseResultsCategories {
    @JsonProperty("hate")
    public Boolean hate;
    public CreateModerationResponseResultsCategories withHate(Boolean hate) {
        this.hate = hate;
        return this;
    }
    
    @JsonProperty("hate/threatening")
    public Boolean hateThreatening;
    public CreateModerationResponseResultsCategories withHateThreatening(Boolean hateThreatening) {
        this.hateThreatening = hateThreatening;
        return this;
    }
    
    @JsonProperty("self-harm")
    public Boolean selfHarm;
    public CreateModerationResponseResultsCategories withSelfHarm(Boolean selfHarm) {
        this.selfHarm = selfHarm;
        return this;
    }
    
    @JsonProperty("sexual")
    public Boolean sexual;
    public CreateModerationResponseResultsCategories withSexual(Boolean sexual) {
        this.sexual = sexual;
        return this;
    }
    
    @JsonProperty("sexual/minors")
    public Boolean sexualMinors;
    public CreateModerationResponseResultsCategories withSexualMinors(Boolean sexualMinors) {
        this.sexualMinors = sexualMinors;
        return this;
    }
    
    @JsonProperty("violence")
    public Boolean violence;
    public CreateModerationResponseResultsCategories withViolence(Boolean violence) {
        this.violence = violence;
        return this;
    }
    
    @JsonProperty("violence/graphic")
    public Boolean violenceGraphic;
    public CreateModerationResponseResultsCategories withViolenceGraphic(Boolean violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
        return this;
    }
    
}
