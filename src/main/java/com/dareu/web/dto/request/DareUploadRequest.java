package com.dareu.web.dto.request;

import java.io.InputStream;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class DareUploadRequest {
    private String dareId; 
    private InputStream stream; 

    public DareUploadRequest() {
    }

    public DareUploadRequest(String dareId, InputStream stream) {
        this.dareId = dareId;
        this.stream = stream;
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
    
    
}
