package com.nf147.platform.dao;

import com.nf147.platform.entity.GeEnterpriseScale;

import java.util.List;

public interface GeEnterpriseScaleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterpriseScale record);

    GeEnterpriseScale selectByPrimaryKey(Integer id);

    List<GeEnterpriseScale> selectAll();

    int updateByPrimaryKey(GeEnterpriseScale record);
}