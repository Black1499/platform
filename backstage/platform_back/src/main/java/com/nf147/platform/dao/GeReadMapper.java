package com.nf147.platform.dao;

import com.nf147.platform.entity.GeRead;

import java.util.List;

public interface GeReadMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeRead record);

    GeRead selectByPrimaryKey(Integer id);

    List<GeRead> selectAll();

    int updateByPrimaryKey(GeRead record);
}