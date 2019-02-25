package com.nf147.platform.service;

import com.nf147.platform.entity.GeAnalyzing;

import java.util.List;

public interface GeAnalyzingService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeAnalyzing record);

    GeAnalyzing selectByPrimaryKey(Integer id);

    List<GeAnalyzing> selectAll();

    int updateByPrimaryKey(GeAnalyzing record);
}