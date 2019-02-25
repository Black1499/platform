package com.nf147.platform.entity;

import java.util.Date;

public class GeUpvote {
    private Integer id;

    private Integer userId;

    private Integer policyId;

    private Date upvoteTime;

    private Date cancelTime;

    private String upvoteType;

    private String policyType;

    private Date opearteTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public Date getUpvoteTime() {
        return upvoteTime;
    }

    public void setUpvoteTime(Date upvoteTime) {
        this.upvoteTime = upvoteTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getUpvoteType() {
        return upvoteType;
    }

    public void setUpvoteType(String upvoteType) {
        this.upvoteType = upvoteType == null ? null : upvoteType.trim();
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType == null ? null : policyType.trim();
    }

    public Date getOpearteTime() {
        return opearteTime;
    }

    public void setOpearteTime(Date opearteTime) {
        this.opearteTime = opearteTime;
    }
}