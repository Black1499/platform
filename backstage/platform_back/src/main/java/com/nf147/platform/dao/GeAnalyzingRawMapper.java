package com.nf147.platform.dao;

import com.nf147.platform.entity.GeAnalyzingRaw;

import java.util.List;

public interface GeAnalyzingRawMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeAnalyzingRaw record);

    GeAnalyzingRaw selectByPrimaryKey(Integer id);

    List<GeAnalyzingRaw> selectAll();

    int updateByPrimaryKey(GeAnalyzingRaw record);
}