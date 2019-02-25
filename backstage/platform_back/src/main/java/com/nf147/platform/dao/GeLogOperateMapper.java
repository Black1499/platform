package com.nf147.platform.dao;

import com.nf147.platform.entity.GeLogOperate;

import java.util.List;

public interface GeLogOperateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeLogOperate record);

    GeLogOperate selectByPrimaryKey(Integer id);

    List<GeLogOperate> selectAll();

    int updateByPrimaryKey(GeLogOperate record);
}