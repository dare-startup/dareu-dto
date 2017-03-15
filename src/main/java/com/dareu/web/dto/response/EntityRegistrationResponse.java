package com.dareu.web.dto.response;

public class EntityRegistrationResponse {

	private String message;
	private String registrationType;
	private String date;
	private String id;

	public EntityRegistrationResponse() {
	}

	public EntityRegistrationResponse(String message, RegistrationType registrationType,
			String date, String id) {
		super();
		this.message = message;
		this.registrationType = registrationType.toString();
		this.date = date;
		this.id = id;
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRegistrationType() {
		return registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static enum RegistrationType{
                ANCHOR("responseAnchor"),
		DARE("dare"), 
		ACCOUNT("account"), 
		DARE_RESPONSE("dareResponse"),
		CATEGORY("category"),
                DARE_FLAG("dareFlag"),
		FRIENDSHIP_REQUEST("friendshipRequest"),
		FRIENDSHIP_RESPONSE("friendshipResponse"),
                CONTACT_MESSAGE("contactMessage"), 
                COMMENT("dareResponseComment"); //TODO: KEEP FILLING HERE..
		
		String value; 
		RegistrationType(String value){
			this.value = value; 
		}
	
		@Override
		public String toString(){
			return value; 
		}
	}
}
