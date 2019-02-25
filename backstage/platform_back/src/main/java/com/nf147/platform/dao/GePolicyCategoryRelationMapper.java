package com.nf147.platform.dao;

import com.nf147.platform.entity.GePolicyCategoryRelation;

import java.util.List;

public interface GePolicyCategoryRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyCategoryRelation record);

    GePolicyCategoryRelation selectByPrimaryKey(Integer id);

    List<GePolicyCategoryRelation> selectAll();

    int updateByPrimaryKey(GePolicyCategoryRelation record);
}