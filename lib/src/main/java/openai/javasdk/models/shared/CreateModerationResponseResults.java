/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateModerationResponseResults {
    @JsonProperty("categories")
    public CreateModerationResponseResultsCategories categories;

    public CreateModerationResponseResults withCategories(CreateModerationResponseResultsCategories categories) {
        this.categories = categories;
        return this;
    }
    
    @JsonProperty("category_scores")
    public CreateModerationResponseResultsCategoryScores categoryScores;

    public CreateModerationResponseResults withCategoryScores(CreateModerationResponseResultsCategoryScores categoryScores) {
        this.categoryScores = categoryScores;
        return this;
    }
    
    @JsonProperty("flagged")
    public Boolean flagged;

    public CreateModerationResponseResults withFlagged(Boolean flagged) {
        this.flagged = flagged;
        return this;
    }
    
    public CreateModerationResponseResults(@JsonProperty("categories") CreateModerationResponseResultsCategories categories, @JsonProperty("category_scores") CreateModerationResponseResultsCategoryScores categoryScores, @JsonProperty("flagged") Boolean flagged) {
        this.categories = categories;
        this.categoryScores = categoryScores;
        this.flagged = flagged;
  }
}
