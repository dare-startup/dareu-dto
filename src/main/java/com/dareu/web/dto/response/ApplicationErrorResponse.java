package com.dareu.web.dto.response;

public class ApplicationErrorResponse {
	private String message; 
	private String date; 
	private int erroCode;
	public ApplicationErrorResponse(String message, String date, int erroCode) {
		super();
		this.message = message;
		this.date = date;
		this.erroCode = erroCode;
	}
	public ApplicationErrorResponse() {
		super();
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
	public int getErroCode() {
		return erroCode;
	}
	public void setErroCode(int erroCode) {
		this.erroCode = erroCode;
	} 
	
	
}
