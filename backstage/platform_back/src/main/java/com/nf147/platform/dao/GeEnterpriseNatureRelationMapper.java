package com.nf147.platform.dao;

import com.nf147.platform.entity.GeEnterpriseNatureRelation;

import java.util.List;

public interface GeEnterpriseNatureRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterpriseNatureRelation record);

    GeEnterpriseNatureRelation selectByPrimaryKey(Integer id);

    List<GeEnterpriseNatureRelation> selectAll();

    int updateByPrimaryKey(GeEnterpriseNatureRelation record);
}