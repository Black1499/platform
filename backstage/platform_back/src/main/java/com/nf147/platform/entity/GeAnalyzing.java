package com.nf147.platform.entity;

import java.util.Date;

public class GeAnalyzing {
    private Integer id;

    private Integer analyzingRawId;

    private Integer policyId;

    private String title;

    private Date releaseTime;

    private String releaseOrganization;

    private String status;

    private Integer commentTimes;

    private Integer sharedTimes;

    private Integer upvoteTimes;

    private Integer favorTimes;

    private Integer readedTimes;

    private Date createdTime;

    private Date updatedTime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnalyzingRawId() {
        return analyzingRawId;
    }

    public void setAnalyzingRawId(Integer analyzingRawId) {
        this.analyzingRawId = analyzingRawId;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getCommentTimes() {
        return commentTimes;
    }

    public void setCommentTimes(Integer commentTimes) {
        this.commentTimes = commentTimes;
    }

    public Integer getSharedTimes() {
        return sharedTimes;
    }

    public void setSharedTimes(Integer sharedTimes) {
        this.sharedTimes = sharedTimes;
    }

    public Integer getUpvoteTimes() {
        return upvoteTimes;
    }

    public void setUpvoteTimes(Integer upvoteTimes) {
        this.upvoteTimes = upvoteTimes;
    }

    public Integer getFavorTimes() {
        return favorTimes;
    }

    public void setFavorTimes(Integer favorTimes) {
        this.favorTimes = favorTimes;
    }

    public Integer getReadedTimes() {
        return readedTimes;
    }

    public void setReadedTimes(Integer readedTimes) {
        this.readedTimes = readedTimes;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}