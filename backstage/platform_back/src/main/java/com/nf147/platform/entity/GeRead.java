package com.nf147.platform.entity;

import java.util.Date;

public class GeRead {
    private Integer id;

    private Integer userId;

    private Integer policyId;

    private Date readedTime;

    private String readedType;

    private String policyType;

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

    public Date getReadedTime() {
        return readedTime;
    }

    public void setReadedTime(Date readedTime) {
        this.readedTime = readedTime;
    }

    public String getReadedType() {
        return readedType;
    }

    public void setReadedType(String readedType) {
        this.readedType = readedType == null ? null : readedType.trim();
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType == null ? null : policyType.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}