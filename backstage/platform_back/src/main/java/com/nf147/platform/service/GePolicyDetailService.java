package com.nf147.platform.service;

import com.nf147.platform.entity.GePolicyDetail;

import java.util.List;

public interface GePolicyDetailService {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyDetail record);

    GePolicyDetail selectByPrimaryKey(Integer id);

    List<GePolicyDetail> selectAll();

    int updateByPrimaryKey(GePolicyDetail record);

    int updataDetailStatus(String status, int id);

    List<GePolicyDetail> findByPage(int start, int pageSize);
}