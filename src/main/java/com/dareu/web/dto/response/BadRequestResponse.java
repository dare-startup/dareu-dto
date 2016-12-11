package com.dareu.web.dto.response;

public class BadRequestResponse {
	private String message; 
	private String date; 
	private int status;
	
	public BadRequestResponse(String message, String date, int status) {
		super();
		this.message = message;
		this.date = date;
		this.status = status;
	}
	
	public BadRequestResponse() {
		
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
