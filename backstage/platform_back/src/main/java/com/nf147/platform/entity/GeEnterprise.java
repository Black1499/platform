package com.nf147.platform.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GeEnterprise {
    private Integer id;

    private String registrationNumber;

    private String name;

    private String address;

    private String representativePeople;

    private BigDecimal registedCaptital;

    private String phoneNumber;

    private String registedOffice;

    private Date registedTime;

    private String registedStatus;

    private Date foundedTime;

    private Date approvedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber == null ? null : registrationNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRepresentativePeople() {
        return representativePeople;
    }

    public void setRepresentativePeople(String representativePeople) {
        this.representativePeople = representativePeople == null ? null : representativePeople.trim();
    }

    public BigDecimal getRegistedCaptital() {
        return registedCaptital;
    }

    public void setRegistedCaptital(BigDecimal registedCaptital) {
        this.registedCaptital = registedCaptital;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getRegistedOffice() {
        return registedOffice;
    }

    public void setRegistedOffice(String registedOffice) {
        this.registedOffice = registedOffice == null ? null : registedOffice.trim();
    }

    public Date getRegistedTime() {
        return registedTime;
    }

    public void setRegistedTime(Date registedTime) {
        this.registedTime = registedTime;
    }

    public String getRegistedStatus() {
        return registedStatus;
    }

    public void setRegistedStatus(String registedStatus) {
        this.registedStatus = registedStatus == null ? null : registedStatus.trim();
    }

    public Date getFoundedTime() {
        return foundedTime;
    }

    public void setFoundedTime(Date foundedTime) {
        this.foundedTime = foundedTime;
    }

    public Date getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(Date approvedTime) {
        this.approvedTime = approvedTime;
    }
}