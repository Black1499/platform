package com.nf147.platform.service;

import com.nf147.platform.entity.GeLogOperate;

import java.util.List;

public interface GeLogOperateService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeLogOperate record);

    GeLogOperate selectByPrimaryKey(Integer id);

    List<GeLogOperate> selectAll();

    int updateByPrimaryKey(GeLogOperate record);
}