package com.dareu.web.dto.request;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class DareConfirmationRequest {
    private String dareId;
    private boolean accepted;

    public DareConfirmationRequest(String dareId, boolean accepted) {
        this.dareId = dareId;
        this.accepted = accepted;
    }

    public DareConfirmationRequest() {
    }

    public String getDareId() {
        return dareId;
    }

    public void setDareId(String dareId) {
        this.dareId = dareId;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    
    
}
