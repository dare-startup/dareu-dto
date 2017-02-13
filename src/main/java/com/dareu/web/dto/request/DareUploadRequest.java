package com.dareu.web.dto.request;

import java.io.InputStream;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class DareUploadRequest {
    private String dareId; 
    private InputStream stream; 
    private String comment; 

    public DareUploadRequest() {
    }

    public DareUploadRequest(String dareId, InputStream stream, String comment) {
        this.dareId = dareId;
        this.stream = stream;
        this.comment = comment; 
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
    
    
}
