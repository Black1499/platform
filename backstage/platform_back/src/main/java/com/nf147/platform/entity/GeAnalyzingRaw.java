package com.nf147.platform.entity;

import java.util.Date;

public class GeAnalyzingRaw {
    private Integer id;

    private Integer policyRawId;

    private String crawlUrl;

    private String localPath;

    private Date crawlTime;

    private String status;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPolicyRawId() {
        return policyRawId;
    }

    public void setPolicyRawId(Integer policyRawId) {
        this.policyRawId = policyRawId;
    }

    public String getCrawlUrl() {
        return crawlUrl;
    }

    public void setCrawlUrl(String crawlUrl) {
        this.crawlUrl = crawlUrl == null ? null : crawlUrl.trim();
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath == null ? null : localPath.trim();
    }

    public Date getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(Date crawlTime) {
        this.crawlTime = crawlTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}