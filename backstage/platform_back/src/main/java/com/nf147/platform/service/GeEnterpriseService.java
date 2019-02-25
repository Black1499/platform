package com.nf147.platform.service;

import com.nf147.platform.entity.GeEnterprise;

import java.util.List;

public interface GeEnterpriseService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterprise record);

    GeEnterprise selectByPrimaryKey(Integer id);

    List<GeEnterprise> selectAll();

    int updateByPrimaryKey(GeEnterprise record);
}