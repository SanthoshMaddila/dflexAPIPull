package com.dflex;

import java.io.Serializable;

public class RequestEntity implements Serializable{
	private String apiOwner;
    private String apiKey;
    private String requestBody;
	public String getApiOwner() {
		return apiOwner;
	}
	public void setApiOwner(String apiOwner) {
		this.apiOwner = apiOwner;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getRequestBody() {
		return requestBody;
	}
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}
	public RequestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestEntity(String apiOwner, String apiKey, String requestBody) {
		super();
		this.apiOwner = apiOwner;
		this.apiKey = apiKey;
		this.requestBody = requestBody;
	}
    
    
}
