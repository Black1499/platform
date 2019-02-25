package com.nf147.platform.dao;

import com.nf147.platform.entity.GeUser;

import java.util.List;

public interface GeUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeUser record);

    GeUser selectByPrimaryKey(Integer id);

    List<GeUser> selectAll();

    int updateByPrimaryKey(GeUser record);
}