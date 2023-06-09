/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateModerationResponseResultsCategoryScores {
    @JsonProperty("hate")
    public Double hate;

    public CreateModerationResponseResultsCategoryScores withHate(Double hate) {
        this.hate = hate;
        return this;
    }
    
    @JsonProperty("hate/threatening")
    public Double hateThreatening;

    public CreateModerationResponseResultsCategoryScores withHateThreatening(Double hateThreatening) {
        this.hateThreatening = hateThreatening;
        return this;
    }
    
    @JsonProperty("self-harm")
    public Double selfHarm;

    public CreateModerationResponseResultsCategoryScores withSelfHarm(Double selfHarm) {
        this.selfHarm = selfHarm;
        return this;
    }
    
    @JsonProperty("sexual")
    public Double sexual;

    public CreateModerationResponseResultsCategoryScores withSexual(Double sexual) {
        this.sexual = sexual;
        return this;
    }
    
    @JsonProperty("sexual/minors")
    public Double sexualMinors;

    public CreateModerationResponseResultsCategoryScores withSexualMinors(Double sexualMinors) {
        this.sexualMinors = sexualMinors;
        return this;
    }
    
    @JsonProperty("violence")
    public Double violence;

    public CreateModerationResponseResultsCategoryScores withViolence(Double violence) {
        this.violence = violence;
        return this;
    }
    
    @JsonProperty("violence/graphic")
    public Double violenceGraphic;

    public CreateModerationResponseResultsCategoryScores withViolenceGraphic(Double violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
        return this;
    }
    
    public CreateModerationResponseResultsCategoryScores(@JsonProperty("hate") Double hate, @JsonProperty("hate/threatening") Double hateThreatening, @JsonProperty("self-harm") Double selfHarm, @JsonProperty("sexual") Double sexual, @JsonProperty("sexual/minors") Double sexualMinors, @JsonProperty("violence") Double violence, @JsonProperty("violence/graphic") Double violenceGraphic) {
        this.hate = hate;
        this.hateThreatening = hateThreatening;
        this.selfHarm = selfHarm;
        this.sexual = sexual;
        this.sexualMinors = sexualMinors;
        this.violence = violence;
        this.violenceGraphic = violenceGraphic;
  }
}
