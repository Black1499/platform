package com.nf147.platform.dao;

import com.nf147.platform.entity.GeEnterprise;

import java.util.List;

public interface GeEnterpriseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEnterprise record);

    GeEnterprise selectByPrimaryKey(Integer id);

    List<GeEnterprise> selectAll();

    int updateByPrimaryKey(GeEnterprise record);
}