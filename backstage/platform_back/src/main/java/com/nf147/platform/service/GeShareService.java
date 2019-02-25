package com.nf147.platform.service;

import com.nf147.platform.entity.GeShare;

import java.util.List;

public interface GeShareService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeShare record);

    GeShare selectByPrimaryKey(Integer id);

    List<GeShare> selectAll();

    int updateByPrimaryKey(GeShare record);
}