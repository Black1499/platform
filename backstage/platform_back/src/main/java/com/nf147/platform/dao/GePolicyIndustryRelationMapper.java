package com.nf147.platform.dao;

import com.nf147.platform.entity.GePolicyIndustryRelation;

import java.util.List;

public interface GePolicyIndustryRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyIndustryRelation record);

    GePolicyIndustryRelation selectByPrimaryKey(Integer id);

    List<GePolicyIndustryRelation> selectAll();

    int updateByPrimaryKey(GePolicyIndustryRelation record);
}