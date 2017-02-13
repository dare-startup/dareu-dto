package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class DareResponseDescription {
    private String id; 
    private DareDescription dare; 
    private String thumbAvailable; 

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

    public String getThumbAvailable() {
        return thumbAvailable;
    }

    public void setThumbAvailable(String thumbAvailable) {
        this.thumbAvailable = thumbAvailable;
    }
    
    
}
