/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package openai.javasdk;

import openai.javasdk.utils.HTTPClient;
import openai.javasdk.utils.SpeakeasyHTTPClient;

/**
 * APIs for sampling from and fine-tuning language models
 */
public class Gpt {
	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final String[] SERVERS = {
        "https://api.openai.com/v1",
	};
  	
    /**
     * The OpenAI REST API
     */
    public OpenAI openAI;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "1.15.0";
	private String _genVersion = "2.22.0";
	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private HTTPClient client;
		
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public Gpt build() throws Exception {
			return new Gpt(this.client, this.serverUrl, this.params);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private Gpt(HTTPClient client, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = openai.javasdk.utils.Utils.templateUrl(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}
		
		
		this.openAI = new OpenAI(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
}