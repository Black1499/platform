package com.nf147.platform.service;

import com.nf147.platform.entity.GeLogError;

import java.util.List;

public interface GeLogErrorService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeLogError record);

    GeLogError selectByPrimaryKey(Integer id);

    List<GeLogError> selectAll();

    int updateByPrimaryKey(GeLogError record);
}