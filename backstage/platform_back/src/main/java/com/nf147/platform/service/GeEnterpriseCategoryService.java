package com.nf147.platform.service;

import com.nf147.platform.entity.GeEnterpriseCategory;

import java.util.List;

public interface GeEnterpriseCategoryService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterpriseCategory record);

    GeEnterpriseCategory selectByPrimaryKey(Integer id);

    List<GeEnterpriseCategory> selectAll();

    int updateByPrimaryKey(GeEnterpriseCategory record);
}