package com.nf147.platform.dao;

import com.nf147.platform.entity.GeShare;

import java.util.List;

public interface GeShareMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeShare record);

    GeShare selectByPrimaryKey(Integer id);

    List<GeShare> selectAll();

    int updateByPrimaryKey(GeShare record);
}