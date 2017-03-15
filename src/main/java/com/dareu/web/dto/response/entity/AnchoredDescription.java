package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class AnchoredDescription {
    private String anchorDate; 
    private DareResponseDescription content; 

    public AnchoredDescription() {
    }

    public AnchoredDescription(String anchorDate, DareResponseDescription content) {
        this.anchorDate = anchorDate;
        this.content = content;
    }
    
    

    public String getAnchorDate() {
        return anchorDate;
    }

    public void setAnchorDate(String anchorDate) {
        this.anchorDate = anchorDate;
    }

    public DareResponseDescription getContent() {
        return content;
    }

    public void setContent(DareResponseDescription content) {
        this.content = content;
    }
    
    
}
