package com.nf147.platform.entity;

import java.util.Date;

public class GeShare {
    private Integer id;

    private Integer userId;

    private Integer policyId;

    private Date sharedTime;

    private String policyType;

    private String sharedType;

    private Date operateTime;

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

    public Date getSharedTime() {
        return sharedTime;
    }

    public void setSharedTime(Date sharedTime) {
        this.sharedTime = sharedTime;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType == null ? null : policyType.trim();
    }

    public String getSharedType() {
        return sharedType;
    }

    public void setSharedType(String sharedType) {
        this.sharedType = sharedType == null ? null : sharedType.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}