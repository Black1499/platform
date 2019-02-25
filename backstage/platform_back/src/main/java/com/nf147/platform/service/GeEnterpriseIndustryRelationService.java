package com.nf147.platform.service;

import com.nf147.platform.entity.GeEnterpriseIndustryRelation;

import java.util.List;

public interface GeEnterpriseIndustryRelationService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterpriseIndustryRelation record);

    GeEnterpriseIndustryRelation selectByPrimaryKey(Integer id);

    List<GeEnterpriseIndustryRelation> selectAll();

    int updateByPrimaryKey(GeEnterpriseIndustryRelation record);
}