package com.dareu.web.dto.request;

public class SigninRequest {
	private String user; 
	private String password;
	public SigninRequest() {
		
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 
	
	
}
