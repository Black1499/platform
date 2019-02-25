package com.nf147.platform.service;

import com.nf147.platform.entity.GeEnterpriseNatureRelation;

import java.util.List;

public interface GeEnterpriseNatureRelationService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterpriseNatureRelation record);

    GeEnterpriseNatureRelation selectByPrimaryKey(Integer id);

    List<GeEnterpriseNatureRelation> selectAll();

    int updateByPrimaryKey(GeEnterpriseNatureRelation record);
}