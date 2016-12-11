package com.dareu.web.dto.request;

public class CreateCategoryRequest {
	private String name; 
	private String description;
	
	public CreateCategoryRequest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	} 
	
	
}
