/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dareu.web.dto.response;

/**
 *
 * @author MACARENA
 */
public class AuthenticationResponse {
    private String token; 
    private String date; 
    private String message;
    
	public AuthenticationResponse() {
		super();
	}

	public AuthenticationResponse(String token, String date, String message) {
		super();
		this.token = token;
		this.date = date;
		this.message = message;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 
    
    
}
