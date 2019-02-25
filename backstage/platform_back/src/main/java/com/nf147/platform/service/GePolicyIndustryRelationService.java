package com.nf147.platform.service;

import com.nf147.platform.entity.GePolicyIndustryRelation;

import java.util.List;

public interface GePolicyIndustryRelationService {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyIndustryRelation record);

    GePolicyIndustryRelation selectByPrimaryKey(Integer id);

    List<GePolicyIndustryRelation> selectAll();

    int updateByPrimaryKey(GePolicyIndustryRelation record);
}