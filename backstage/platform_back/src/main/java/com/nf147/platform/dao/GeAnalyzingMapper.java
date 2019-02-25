package com.nf147.platform.dao;

import com.nf147.platform.entity.GeAnalyzing;

import java.util.List;

public interface GeAnalyzingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeAnalyzing record);

    GeAnalyzing selectByPrimaryKey(Integer id);

    List<GeAnalyzing> selectAll();

    int updateByPrimaryKey(GeAnalyzing record);
}