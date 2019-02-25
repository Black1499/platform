package com.nf147.platform.dao;

import com.nf147.platform.entity.GePolicy;

import java.util.List;

public interface GePolicyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicy record);

    GePolicy selectByPrimaryKey(Integer id);

    List<GePolicy> selectAll();

    int updateByPrimaryKey(GePolicy record);
}