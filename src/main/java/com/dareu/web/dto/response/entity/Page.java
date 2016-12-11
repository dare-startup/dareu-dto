package com.dareu.web.dto.response.entity;

import java.util.List;

/**
 *
 * @author jose.rubalcaba
 * @param <T>
 */
public class Page<T> {
    private List<T> items; 
    private int pageNumber; 
    private int pageSize; 
    private int pagesAvailable;

    public Page(List<T> items, int pageNumber, int pageSize) {
        this.items = items;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public Page() {
    }

    
    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPagesAvailable() {
        return pagesAvailable;
    }

    public void setPagesAvailable(int pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
    }
    
    
}
