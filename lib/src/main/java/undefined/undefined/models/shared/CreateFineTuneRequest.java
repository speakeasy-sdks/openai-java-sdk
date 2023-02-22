package undefined.undefined.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateFineTuneRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batch_size")
    public Long batchSize;
    public CreateFineTuneRequest withBatchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classification_betas")
    public Double[] classificationBetas;
    public CreateFineTuneRequest withClassificationBetas(Double[] classificationBetas) {
        this.classificationBetas = classificationBetas;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classification_n_classes")
    public Long classificationNClasses;
    public CreateFineTuneRequest withClassificationNClasses(Long classificationNClasses) {
        this.classificationNClasses = classificationNClasses;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classification_positive_class")
    public String classificationPositiveClass;
    public CreateFineTuneRequest withClassificationPositiveClass(String classificationPositiveClass) {
        this.classificationPositiveClass = classificationPositiveClass;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compute_classification_metrics")
    public Boolean computeClassificationMetrics;
    public CreateFineTuneRequest withComputeClassificationMetrics(Boolean computeClassificationMetrics) {
        this.computeClassificationMetrics = computeClassificationMetrics;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("learning_rate_multiplier")
    public Double learningRateMultiplier;
    public CreateFineTuneRequest withLearningRateMultiplier(Double learningRateMultiplier) {
        this.learningRateMultiplier = learningRateMultiplier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("model")
    public String model;
    public CreateFineTuneRequest withModel(String model) {
        this.model = model;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("n_epochs")
    public Long nEpochs;
    public CreateFineTuneRequest withNEpochs(Long nEpochs) {
        this.nEpochs = nEpochs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prompt_loss_weight")
    public Double promptLossWeight;
    public CreateFineTuneRequest withPromptLossWeight(Double promptLossWeight) {
        this.promptLossWeight = promptLossWeight;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("suffix")
    public String suffix;
    public CreateFineTuneRequest withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    
    @JsonProperty("training_file")
    public String trainingFile;
    public CreateFineTuneRequest withTrainingFile(String trainingFile) {
        this.trainingFile = trainingFile;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validation_file")
    public String validationFile;
    public CreateFineTuneRequest withValidationFile(String validationFile) {
        this.validationFile = validationFile;
        return this;
    }
    
}
