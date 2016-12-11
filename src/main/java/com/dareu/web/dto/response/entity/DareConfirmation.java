package com.dareu.web.dto.response.entity;

public class DareConfirmation {
	private boolean accepted; 
	private String userId; 
	private String acceptedDate;
	public DareConfirmation(boolean accepted, String userId,
			String acceptedDate) {
		super();
		this.accepted = accepted;
		this.userId = userId;
		this.acceptedDate = acceptedDate;
	}
	public DareConfirmation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAcceptedDate() {
		return acceptedDate;
	}
	public void setAcceptedDate(String acceptedDate) {
		this.acceptedDate = acceptedDate;
	} 
	
	
}
