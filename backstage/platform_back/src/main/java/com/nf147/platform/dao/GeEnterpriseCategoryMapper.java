package com.nf147.platform.dao;

import com.nf147.platform.entity.GeEnterpriseCategory;

import java.util.List;

public interface GeEnterpriseCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterpriseCategory record);

    GeEnterpriseCategory selectByPrimaryKey(Integer id);

    List<GeEnterpriseCategory> selectAll();

    int updateByPrimaryKey(GeEnterpriseCategory record);
}