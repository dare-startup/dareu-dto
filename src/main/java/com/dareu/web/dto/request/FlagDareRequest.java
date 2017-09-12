package com.dareu.web.dto.request;

public class FlagDareRequest {
    private String dareId; 
    private String comment; 

    public FlagDareRequest() {
    }

    public FlagDareRequest(String dareId, String comment) {
        this.dareId = dareId;
        this.comment = comment;
    }

    public String getDareId() {
        return dareId;
    }

    public void setDareId(String dareId) {
        this.dareId = dareId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
