package com.nf147.platform.service;

import com.nf147.platform.entity.GeEnterpriseScale;

import java.util.List;

public interface GeEnterpriseScaleService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterpriseScale record);

    GeEnterpriseScale selectByPrimaryKey(Integer id);

    List<GeEnterpriseScale> selectAll();

    int updateByPrimaryKey(GeEnterpriseScale record);
}