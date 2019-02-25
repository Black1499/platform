package com.nf147.platform.service;

import com.nf147.platform.entity.GeLogSystem;

import java.util.List;

public interface GeLogSystemService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeLogSystem record);

    GeLogSystem selectByPrimaryKey(Integer id);

    List<GeLogSystem> selectAll();

    int updateByPrimaryKey(GeLogSystem record);
}