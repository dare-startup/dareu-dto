package com.dareu.web.dto.response;

public class ResourceAvailableResponse {
	private boolean isAvailable; 
	private String message; 
	private String date;
	public ResourceAvailableResponse() {
		
	}
	
	
	public ResourceAvailableResponse(boolean isAvailable, String message,
			String date) {
		super();
		this.isAvailable = isAvailable;
		this.message = message;
		this.date = date;
	}


	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	} 
	
	
}
