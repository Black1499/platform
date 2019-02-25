package com.nf147.platform.dao;

import com.nf147.platform.entity.GeComment;

import java.util.List;

public interface GeCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeComment record);

    GeComment selectByPrimaryKey(Integer id);

    List<GeComment> selectAll();

    int updateByPrimaryKey(GeComment record);
}