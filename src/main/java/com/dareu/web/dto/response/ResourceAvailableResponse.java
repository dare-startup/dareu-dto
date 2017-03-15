package com.dareu.web.dto.response;

public class ResourceAvailableResponse {
	private boolean available;
	private String message; 
	private String date;
	public ResourceAvailableResponse() {
		
	}
	
	
	public ResourceAvailableResponse(boolean isAvailable, String message,
			String date) {
		this.available = isAvailable;
		this.message = message;
		this.date = date;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
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
