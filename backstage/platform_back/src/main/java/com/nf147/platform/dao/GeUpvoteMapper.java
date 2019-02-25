package com.nf147.platform.dao;

import com.nf147.platform.entity.GeUpvote;

import java.util.List;

public interface GeUpvoteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeUpvote record);

    GeUpvote selectByPrimaryKey(Integer id);

    List<GeUpvote> selectAll();

    int updateByPrimaryKey(GeUpvote record);
}