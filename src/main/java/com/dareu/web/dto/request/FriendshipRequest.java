package com.dareu.web.dto.request;

public class FriendshipRequest {
	
	private String userId;
	private String requestedUserId;
	public FriendshipRequest() {
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRequestedUserId() {
		return requestedUserId;
	}
	public void setRequestedUserId(String requestedUserId) {
		this.requestedUserId = requestedUserId;
	}
	
	
}
