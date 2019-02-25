package com.nf147.platform.service;

import com.nf147.platform.entity.GeEducationCategory;

import java.util.List;

public interface GeEducationCategoryService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeEducationCategory record);

    GeEducationCategory selectByPrimaryKey(Integer id);

    List<GeEducationCategory> selectAll();

    int updateByPrimaryKey(GeEducationCategory record);
}