package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class DareResponseDescription {
    private String id; 
    private DareDescription dare; 
    private boolean thumbAvailable; 

    public DareResponseDescription() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DareDescription getDare() {
        return dare;
    }

    public void setDare(DareDescription dare) {
        this.dare = dare;
    }

    public boolean isThumbAvailable() {
        return thumbAvailable;
    }

    public void setThumbAvailable(boolean thumbAvailable) {
        this.thumbAvailable = thumbAvailable;
    }
    
    
}
