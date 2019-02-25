package com.nf147.platform.service;

import com.nf147.platform.entity.GeUser;

import java.util.List;

public interface GeUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeUser record);

    GeUser selectByPrimaryKey(Integer id);

    List<GeUser> selectAll();

    int updateByPrimaryKey(GeUser record);
}