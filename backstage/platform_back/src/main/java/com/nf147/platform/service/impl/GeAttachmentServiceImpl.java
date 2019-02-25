package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeAttachmentMapper;
import com.nf147.platform.entity.GeAttachment;
import com.nf147.platform.service.GeAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周
 * // TODO: 2019/2/18
 *附件
 */
@Service
public class GeAttachmentServiceImpl implements GeAttachmentService {
    @Autowired
    private GeAttachmentMapper geAttachmentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geAttachmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeAttachment record) {
        return geAttachmentMapper.insert(record);
    }

    @Override
    public GeAttachment selectByPrimaryKey(Integer id) {
        return geAttachmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeAttachment> selectAll() {
        return geAttachmentMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeAttachment record) {
        return geAttachmentMapper.updateByPrimaryKey(record);
    }
}
