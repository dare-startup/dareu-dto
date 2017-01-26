package com.dareu.web.dto.response;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class UpdatedEntityResponse {
    private String message; 
    private boolean success;
    private String entityType;

    public UpdatedEntityResponse() {
    }

    public UpdatedEntityResponse(String message, boolean success, String entityType) {
        this.message = message;
        this.success = success;
        this.entityType = entityType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
    
    
}
