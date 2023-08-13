/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Embedding - Represents an embedding vector returned by embedding endpoint.
 * 
 */

public class Embedding {
    /**
     * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).
     * 
     */
    @JsonProperty("embedding")
    public Double[] embedding;

    public Embedding withEmbedding(Double[] embedding) {
        this.embedding = embedding;
        return this;
    }
    
    /**
     * The index of the embedding in the list of embeddings.
     */
    @JsonProperty("index")
    public Long index;

    public Embedding withIndex(Long index) {
        this.index = index;
        return this;
    }
    
    /**
     * The object type, which is always "embedding".
     */
    @JsonProperty("object")
    public String object;

    public Embedding withObject(String object) {
        this.object = object;
        return this;
    }
    
    public Embedding(@JsonProperty("embedding") Double[] embedding, @JsonProperty("index") Long index, @JsonProperty("object") String object) {
        this.embedding = embedding;
        this.index = index;
        this.object = object;
  }
}
