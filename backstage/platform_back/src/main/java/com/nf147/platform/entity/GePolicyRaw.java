package com.nf147.platform.entity;

import java.util.Date;

public class GePolicyRaw {
    private Integer id;

    private String crawlUrl;

    private Date crawlTime;

    private String indexNumber;

    private String title;

    private String releaseOffice;

    private String releaseNumber;

    private String policyBasis;

    private Date wirittenTime;

    private Date releaseTime;

    private Date effectTime;

    private String imageUrl;

    private String status;

    private String remark;

    private String content;

    private String html;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCrawlUrl() {
        return crawlUrl;
    }

    public void setCrawlUrl(String crawlUrl) {
        this.crawlUrl = crawlUrl == null ? null : crawlUrl.trim();
    }

    public Date getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(Date crawlTime) {
        this.crawlTime = crawlTime;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber == null ? null : indexNumber.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getReleaseOffice() {
        return releaseOffice;
    }

    public void setReleaseOffice(String releaseOffice) {
        this.releaseOffice = releaseOffice == null ? null : releaseOffice.trim();
    }

    public String getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(String releaseNumber) {
        this.releaseNumber = releaseNumber == null ? null : releaseNumber.trim();
    }

    public String getPolicyBasis() {
        return policyBasis;
    }

    public void setPolicyBasis(String policyBasis) {
        this.policyBasis = policyBasis == null ? null : policyBasis.trim();
    }

    public Date getWirittenTime() {
        return wirittenTime;
    }

    public void setWirittenTime(Date wirittenTime) {
        this.wirittenTime = wirittenTime;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html == null ? null : html.trim();
    }
}