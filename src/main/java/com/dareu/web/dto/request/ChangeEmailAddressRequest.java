package com.dareu.web.dto.request;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class ChangeEmailAddressRequest {
    private String newEmail; 

    public ChangeEmailAddressRequest() {
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }
    
    
}
