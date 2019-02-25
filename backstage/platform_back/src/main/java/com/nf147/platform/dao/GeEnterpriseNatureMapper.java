package com.nf147.platform.dao;

import com.nf147.platform.entity.GeEnterpriseNature;

import java.util.List;

public interface GeEnterpriseNatureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterpriseNature record);

    GeEnterpriseNature selectByPrimaryKey(Integer id);

    List<GeEnterpriseNature> selectAll();

    int updateByPrimaryKey(GeEnterpriseNature record);
}