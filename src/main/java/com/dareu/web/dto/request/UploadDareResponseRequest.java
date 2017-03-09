package com.dareu.web.dto.request;

/**
 * Created by jose.rubalcaba on 02/16/2017.
 */

public class UploadDareResponseRequest {
    private String dareid;
    private String comment;
    private String thumbImagePath;
    private String videoPath;

    public UploadDareResponseRequest() {
    }

    public String getDareid() {
        return dareid;
    }

    public void setDareid(String dareid) {
        this.dareid = dareid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getThumbImagePath() {
        return thumbImagePath;
    }

    public void setThumbImagePath(String thumbImagePath) {
        this.thumbImagePath = thumbImagePath;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }
}
