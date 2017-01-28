package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class PaginationData {
    private boolean backwardEnabled; 
    private boolean forwardEnabled; 
    private int pageNumber; 
    private int pagesAvailable; 

    public PaginationData() {
    }

    public boolean isBackwardEnabled() {
        return backwardEnabled;
    }

    public void setBackwardEnabled(boolean backwardEnabled) {
        this.backwardEnabled = backwardEnabled;
    }

    public boolean isForwardEnabled() {
        return forwardEnabled;
    }

    public void setForwardEnabled(boolean forwardEnabled) {
        this.forwardEnabled = forwardEnabled;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPagesAvailable() {
        return pagesAvailable;
    }

    public void setPagesAvailable(int pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
    }
    
    
    
}
