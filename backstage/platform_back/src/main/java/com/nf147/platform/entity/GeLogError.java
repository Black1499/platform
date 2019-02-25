package com.nf147.platform.entity;

import java.util.Date;

public class GeLogError {
    private Integer id;

    private Integer logOperateId;

    private Integer userId;

    private Date errTime;

    private String errInfo;

    private String userType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLogOperateId() {
        return logOperateId;
    }

    public void setLogOperateId(Integer logOperateId) {
        this.logOperateId = logOperateId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getErrTime() {
        return errTime;
    }

    public void setErrTime(Date errTime) {
        this.errTime = errTime;
    }

    public String getErrInfo() {
        return errInfo;
    }

    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo == null ? null : errInfo.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }
}