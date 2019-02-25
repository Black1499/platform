package com.nf147.platform.dao;

import com.nf147.platform.entity.GeAttachment;

import java.util.List;

public interface GeAttachmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeAttachment record);

    GeAttachment selectByPrimaryKey(Integer id);

    List<GeAttachment> selectAll();

    int updateByPrimaryKey(GeAttachment record);
}