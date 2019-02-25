package com.nf147.platform.service;

import com.nf147.platform.entity.GePolicyCategoryRelation;

import java.util.List;

public interface GePolicyCategoryRelationService {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyCategoryRelation record);

    GePolicyCategoryRelation selectByPrimaryKey(Integer id);

    List<GePolicyCategoryRelation> selectAll();

    int updateByPrimaryKey(GePolicyCategoryRelation record);
}