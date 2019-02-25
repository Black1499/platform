package com.nf147.platform.entity;

import java.util.Date;

public class GeAnnouncement {
    private Integer id;

    private String title;

    private String subtitle;

    private String author;

    private String editor;

    private Date releaseTime;

    private String releaseOrganization;

    private Integer readedTimes;

    private String status;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getReleaseOrganization() {
        return releaseOrganization;
    }

    public void setReleaseOrganization(String releaseOrganization) {
        this.releaseOrganization = releaseOrganization == null ? null : releaseOrganization.trim();
    }

    public Integer getReadedTimes() {
        return readedTimes;
    }

    public void setReadedTimes(Integer readedTimes) {
        this.readedTimes = readedTimes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}