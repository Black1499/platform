package com.nf147.platform.dao;

import com.nf147.platform.entity.GeEnterpriseIndustryRelation;

import java.util.List;

public interface GeEnterpriseIndustryRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterpriseIndustryRelation record);

    GeEnterpriseIndustryRelation selectByPrimaryKey(Integer id);

    List<GeEnterpriseIndustryRelation> selectAll();

    int updateByPrimaryKey(GeEnterpriseIndustryRelation record);
}