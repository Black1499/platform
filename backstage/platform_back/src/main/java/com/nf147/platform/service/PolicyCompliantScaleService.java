package com.nf147.platform.service;

import com.nf147.platform.entity.PolicyCompliantScale;

import java.util.List;

public interface PolicyCompliantScaleService {
    int deleteByPrimaryKey(Integer id);

    int insert(PolicyCompliantScale record);

    PolicyCompliantScale selectByPrimaryKey(Integer id);

    List<PolicyCompliantScale> selectAll();

    int updateByPrimaryKey(PolicyCompliantScale record);
}