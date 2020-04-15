package com.norha.model;

public class RequestTokenParams {
	String code,	
	client_id,
	client_secret,	
	redirect_uri,	
	grant_type;
	
	public RequestTokenParams(String code, String client_id, String client_secret, String redirect_uri,
			String grant_type) {
		super();
		this.code = code;
		this.client_id = client_id;
		this.client_secret = client_secret;
		this.redirect_uri = redirect_uri;
		this.grant_type = grant_type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getClient_secret() {
		return client_secret;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public String getRedirect_uri() {
		return redirect_uri;
	}

	public void setRedirect_uri(String redirect_uri) {
		this.redirect_uri = redirect_uri;
	}

	public String getGrant_type() {
		return grant_type;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	
	/*
	 * Google Token Server URL Google token server URL:
	 * https://www.googleapis.com/oauth2/v4/token
	 *  
	 * We need to post the fields given below to the Google token server URL.
	 * 
	 * FIELDS code The authorization code returned from the initial request.
	 * client_id The client ID obtained from the API Console. client_secret The
	 * client secret obtained from the API Console. redirect_uri One of the redirect
	 * URIs listed for your project in the API Console. grant_type As defined in the
	 * OAuth 2.0 specification, this field must contain a value of
	 * authorization_code.
	 */
}
