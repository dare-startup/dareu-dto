package com.dareu.web.dto.request;

import java.io.InputStream;

public class DareUploadRequest {
    private String dareId; 
    private InputStream stream; 
    private String comment; 
    private InputStream thumb;

    public DareUploadRequest() {
    }

    public DareUploadRequest(String dareId, InputStream stream, String comment, InputStream thumb) {
        this.dareId = dareId;
        this.stream = stream;
        this.comment = comment; 
        this.thumb = thumb;
    }

    public String getDareId() {
        return dareId;
    }

    public void setDareId(String dareId) {
        this.dareId = dareId;
    }

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public InputStream getThumb() {
        return thumb;
    }

    public void setThumb(InputStream thumb) {
        this.thumb = thumb;
    }
    
    
}
