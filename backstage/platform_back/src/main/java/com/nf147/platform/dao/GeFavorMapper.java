package com.nf147.platform.dao;

import com.nf147.platform.entity.GeFavor;

import java.util.List;

public interface GeFavorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeFavor record);

    GeFavor selectByPrimaryKey(Integer id);

    List<GeFavor> selectAll();

    int updateByPrimaryKey(GeFavor record);
}