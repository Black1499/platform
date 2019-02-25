package com.nf147.platform.entity;

public class GeArea {
    private Integer id;

    private String areaName;

    private String code;

    private String zipcode;

    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "GeArea{" +
                "id=" + id +
                ", areaName='" + areaName + '\'' +
                ", code='" + code + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}