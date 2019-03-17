package com.nf147.platform.entity;

import java.util.Date;

public class GeLogVisit {
    private Integer id;

    private Integer userId;

    private String ip;

    private String visitUrl;

    private Date visitTime;

    private Integer visitTimes;

    public GeLogVisit() {
    }

    public GeLogVisit(Integer userId, String ip, String visitUrl, Date visitTime, Integer visitTimes) {
        this.userId = userId;
        this.ip = ip;
        this.visitUrl = visitUrl;
        this.visitTime = visitTime;
        this.visitTimes = visitTimes;
    }

    public GeLogVisit(String ip, String visitUrl, Date visitTime, Integer visitTimes) {
        this.ip = ip;
        this.visitUrl = visitUrl;
        this.visitTime = visitTime;
        this.visitTimes = visitTimes;
    }

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getVisitUrl() {
        return visitUrl;
    }

    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl == null ? null : visitUrl.trim();
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public Integer getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(Integer visitTimes) {
        this.visitTimes = visitTimes;
    }
}