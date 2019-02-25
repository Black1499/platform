package com.nf147.platform.entity;

import java.util.Date;

public class GePolicy {
    private Integer id;

    private Integer policyDetailId;

    private String keyWord;

    private String declarationUrl;

    private String policyType;

    private Integer areaId;

    private Integer commentTimes;

    private Integer sharedTimes;

    private Integer upvoteTimes;

    private Integer favorTimes;

    private Integer readedTimes;

    private Date createdTime;

    private Date updatedTime;

    public GePolicy() {
    }

    public GePolicy(Integer policyDetailId, Date createdTime) {
        this.policyDetailId = policyDetailId;
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "GePolicy{" +
                "id=" + id +
                ", policyDetailId=" + policyDetailId +
                ", keyWord='" + keyWord + '\'' +
                ", declarationUrl='" + declarationUrl + '\'' +
                ", policyType='" + policyType + '\'' +
                ", areaId=" + areaId +
                ", commentTimes=" + commentTimes +
                ", sharedTimes=" + sharedTimes +
                ", upvoteTimes=" + upvoteTimes +
                ", favorTimes=" + favorTimes +
                ", readedTimes=" + readedTimes +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPolicyDetailId() {
        return policyDetailId;
    }

    public void setPolicyDetailId(Integer policyDetailId) {
        this.policyDetailId = policyDetailId;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }

    public String getDeclarationUrl() {
        return declarationUrl;
    }

    public void setDeclarationUrl(String declarationUrl) {
        this.declarationUrl = declarationUrl == null ? null : declarationUrl.trim();
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType == null ? null : policyType.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
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
}