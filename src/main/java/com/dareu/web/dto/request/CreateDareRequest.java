package com.dareu.web.dto.request;

public class CreateDareRequest {
	private String name; 
	private String[] friendsIds;
	private String description; 
	private String categoryId; 
	private int timer;
	
	public CreateDareRequest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getFriendsIds() {
		return friendsIds;
	}

	public void setFriendsIds(String[] friendsIds) {
		this.friendsIds = friendsIds;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	} 
	
	
}
