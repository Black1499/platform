package com.nf147.platform.entity;

import java.util.Date;

public class GeLogOperate {
    private Integer id;

    private Date opearteTime;

    private Integer userId;

    private String record;

    private String userType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOpearteTime() {
        return opearteTime;
    }

    public void setOpearteTime(Date opearteTime) {
        this.opearteTime = opearteTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }
}