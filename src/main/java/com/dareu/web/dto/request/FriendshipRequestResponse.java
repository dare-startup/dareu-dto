package com.dareu.web.dto.request;

public class FriendshipRequestResponse {
	private boolean approved;
	private String friendshipid;
	public FriendshipRequestResponse() {
		super();
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public String getFriendshipid() {
		return friendshipid;
	}
	public void setFriendshipid(String friendshipid) {
		this.friendshipid = friendshipid;
	} 
	
	
}
