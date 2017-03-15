package com.dareu.web.dto.request;

public class SigninRequest {
	private String user; 
	private String password;
	private SigninType currentSigninType = SigninType.LOCAL;
    private String googleId;

	public SigninRequest() {
		
	}

    public SigninRequest(String user, String password) {
        this.user = user;
        this.password = password;
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

    public SigninType getCurrentSigninType() {
        return currentSigninType;
    }

    public void setCurrentSigninType(SigninType currentSigninType) {
        this.currentSigninType = currentSigninType;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public enum SigninType{
        LOCAL, GOOGLE
    }
}
