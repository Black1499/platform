package com.nf147.platform.service;

import com.nf147.platform.entity.GeComment;

import java.util.List;

public interface GeCommentService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeComment record);

    GeComment selectByPrimaryKey(Integer id);

    List<GeComment> selectAll();

    int updateByPrimaryKey(GeComment record);
}