package com.nf147.platform.entity;

public class GePolicyCompliantNature {
    private Integer id;

    private Integer enterpriseNatureId;

    private Integer policyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnterpriseNatureId() {
        return enterpriseNatureId;
    }

    public void setEnterpriseNatureId(Integer enterpriseNatureId) {
        this.enterpriseNatureId = enterpriseNatureId;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }
}