package com.dareu.web.dto.response;

import java.util.List;

public class ListResponse<T> {
	private List<T> list;
	private String date; 
	private String objectType;
	public ListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ListResponse(List<T> list, String date, String objectType) {
		super();
		this.list = list;
		this.date = date;
		this.objectType = objectType;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getObjectType() {
		return objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	} 
	
	
}
