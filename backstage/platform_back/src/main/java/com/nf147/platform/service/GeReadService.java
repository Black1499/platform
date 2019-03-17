package com.nf147.platform.service;

import com.nf147.platform.entity.GeRead;

import java.util.List;

/**
 * @author  张东明
 * // TODO: 2019/3/8
 */
public interface GeReadService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeRead record);

    GeRead selectByPrimaryKey(Integer id);

    List<GeRead> selectAll();

    int updateByPrimaryKey(GeRead record);
}