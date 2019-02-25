package com.nf147.platform.entity;

import java.util.Date;

public class GeFavor {
    private Integer id;

    private Integer userId;

    private Integer policyId;

    private Date favorTime;

    private String favorType;

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

    public Date getFavorTime() {
        return favorTime;
    }

    public void setFavorTime(Date favorTime) {
        this.favorTime = favorTime;
    }

    public String getFavorType() {
        return favorType;
    }

    public void setFavorType(String favorType) {
        this.favorType = favorType == null ? null : favorType.trim();
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