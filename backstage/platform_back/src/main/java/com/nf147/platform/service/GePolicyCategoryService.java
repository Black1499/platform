package com.nf147.platform.service;

import com.nf147.platform.entity.GePolicyCategory;

import java.util.List;

public interface GePolicyCategoryService {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyCategory record);

    GePolicyCategory selectByPrimaryKey(Integer id);

    List<GePolicyCategory> selectAll();

    int updateByPrimaryKey(GePolicyCategory record);
}