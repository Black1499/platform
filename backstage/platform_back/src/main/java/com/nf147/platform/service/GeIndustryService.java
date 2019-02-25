package com.nf147.platform.service;

import com.nf147.platform.entity.GeIndustry;

import java.util.List;

public interface GeIndustryService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeIndustry record);

    GeIndustry selectByPrimaryKey(Integer id);

    List<GeIndustry> selectAll();

    int updateByPrimaryKey(GeIndustry record);
}