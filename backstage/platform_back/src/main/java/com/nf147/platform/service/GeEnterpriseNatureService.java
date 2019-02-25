package com.nf147.platform.service;

import com.nf147.platform.entity.GeEnterpriseNature;

import java.util.List;

public interface GeEnterpriseNatureService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterpriseNature record);

    GeEnterpriseNature selectByPrimaryKey(Integer id);

    List<GeEnterpriseNature> selectAll();

    int updateByPrimaryKey(GeEnterpriseNature record);
}