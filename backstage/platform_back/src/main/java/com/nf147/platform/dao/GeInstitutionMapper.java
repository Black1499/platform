package com.nf147.platform.dao;

import com.nf147.platform.entity.GeInstitution;

import java.util.List;

public interface GeInstitutionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeInstitution record);

    GeInstitution selectByPrimaryKey(Integer id);

    List<GeInstitution> selectAll();

    int updateByPrimaryKey(GeInstitution record);
}