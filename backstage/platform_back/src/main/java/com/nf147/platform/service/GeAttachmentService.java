package com.nf147.platform.service;

import com.nf147.platform.entity.GeAttachment;

import java.util.List;

public interface GeAttachmentService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeAttachment record);

    GeAttachment selectByPrimaryKey(Integer id);

    List<GeAttachment> selectAll();

    int updateByPrimaryKey(GeAttachment record);
}