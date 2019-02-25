package com.nf147.platform.service;

import com.nf147.platform.entity.GeInstitution;

import java.util.List;

public interface GeInstitutionService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeInstitution record);

    GeInstitution selectByPrimaryKey(Integer id);

    List<GeInstitution> selectAll();

    int updateByPrimaryKey(GeInstitution record);
}