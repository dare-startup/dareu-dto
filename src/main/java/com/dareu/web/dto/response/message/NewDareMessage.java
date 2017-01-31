package com.dareu.web.dto.response.message;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class NewDareMessage extends AbstractMessage{
    private String dareId; 
    private String dareName; 
    private String dareDescription; 
    private int timer; 
    private String challenger; 

    public NewDareMessage(String dareId, String dareName, String dareDescription, int timer, String challenger) {
        super(MessageType.NEW_DARE);
        this.dareId = dareId;
        this.dareName = dareName;
        this.dareDescription = dareDescription;
        this.timer = timer;
        this.challenger = challenger;
    }

    public NewDareMessage() {
        super(MessageType.NEW_DARE);
    }

    public String getDareId() {
        return dareId;
    }

    public void setDareId(String dareId) {
        this.dareId = dareId;
    }

    public String getDareName() {
        return dareName;
    }

    public void setDareName(String dareName) {
        this.dareName = dareName;
    }

    public String getDareDescription() {
        return dareDescription;
    }

    public void setDareDescription(String dareDescription) {
        this.dareDescription = dareDescription;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public String getChallenger() {
        return challenger;
    }

    public void setChallenger(String challenger) {
        this.challenger = challenger;
    }
    
    
    
}
