package com.dareu.web.dto.response;

import java.text.SimpleDateFormat;
import java.util.Date;


public class AuthorizationResponse {
	private String message;
	private String datetime; 

	public AuthorizationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthorizationResponse(String message) {
		super();
		this.message = message;
		this.datetime = new SimpleDateFormat("MM-dd-yyyy").format(new Date()); 
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	} 
	
	
}
