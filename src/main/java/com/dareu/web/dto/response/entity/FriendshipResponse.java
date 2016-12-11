package com.dareu.web.dto.response.entity;

public class FriendshipResponse {

	private String id;
	private String name;
	private String imageUrl; 
                
	private Long dareCount;
	private Long videoResponsesCount;
	
	public FriendshipResponse(){}
	public FriendshipResponse(final String id, final String name){
		this.id = id;
		this.name = name;
	}
	public FriendshipResponse(final String id, final String name, final Long dareCount, final Long videoCount){
		this.id = id;
		this.name = name;
		this.dareCount = dareCount;
		this.videoResponsesCount = videoCount;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getDareCount() {
		return dareCount;
	}
	public void setDareCount(Long dareCount) {
		this.dareCount = dareCount;
	}
	public Long getVideoResponsesCount() {
		return videoResponsesCount;
	}
	public void setVideoResponsesCount(Long videoResponsesCount) {
		this.videoResponsesCount = videoResponsesCount;
	}

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
	
	
}
