package com.nf147.platform.dao;

import com.nf147.platform.entity.GeLogVisit;

import java.util.List;

public interface GeLogVisitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeLogVisit record);

    GeLogVisit selectByPrimaryKey(Integer id);

    List<GeLogVisit> selectAll();

    int updateByPrimaryKey(GeLogVisit record);
}