package com.nf147.platform.entity;

import java.util.Date;

public class GeSubscription {
    private Integer id;

    private Integer userId;

    private Integer policyId;

    private Date subsTime;

    private Date cancelTime;

    private String subsType;

    private String policyType;

    private String subsStatus;

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

    public Date getSubsTime() {
        return subsTime;
    }

    public void setSubsTime(Date subsTime) {
        this.subsTime = subsTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getSubsType() {
        return subsType;
    }

    public void setSubsType(String subsType) {
        this.subsType = subsType == null ? null : subsType.trim();
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType == null ? null : policyType.trim();
    }

    public String getSubsStatus() {
        return subsStatus;
    }

    public void setSubsStatus(String subsStatus) {
        this.subsStatus = subsStatus == null ? null : subsStatus.trim();
    }
}