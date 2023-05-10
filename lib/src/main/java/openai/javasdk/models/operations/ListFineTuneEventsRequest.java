/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import openai.javasdk.utils.SpeakeasyMetadata;

public class ListFineTuneEventsRequest {
    /**
     * The ID of the fine-tune job to get events for.
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fine_tune_id")
    public String fineTuneId;

    public ListFineTuneEventsRequest withFineTuneId(String fineTuneId) {
        this.fineTuneId = fineTuneId;
        return this;
    }
    
    /**
     * Whether to stream events for the fine-tune job. If set to true,
     * events will be sent as data-only
     * [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format)
     * as they become available. The stream will terminate with a
     * `data: [DONE]` message when the job is finished (succeeded, cancelled,
     * or failed).
     * 
     * If set to false, only events generated so far will be returned.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=stream")
    public Boolean stream;

    public ListFineTuneEventsRequest withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    
    public ListFineTuneEventsRequest(@JsonProperty("fine_tune_id") String fineTuneId) {
        this.fineTuneId = fineTuneId;
  }
}
