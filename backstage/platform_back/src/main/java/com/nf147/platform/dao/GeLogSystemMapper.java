package com.nf147.platform.dao;

import com.nf147.platform.entity.GeLogSystem;

import java.util.List;

public interface GeLogSystemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeLogSystem record);

    GeLogSystem selectByPrimaryKey(Integer id);

    List<GeLogSystem> selectAll();

    int updateByPrimaryKey(GeLogSystem record);
}