package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeAnalyzingRawMapper;
import com.nf147.platform.entity.GeAnalyzingRaw;
import com.nf147.platform.service.GeAnalyzingRawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周
 * // TODO: 2019/2/18
 *原始解读
 */
@Service
public class GeAnalyzingRawServiceImpl implements GeAnalyzingRawService {
    @Autowired
    private GeAnalyzingRawMapper geAnalyzingRawMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geAnalyzingRawMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeAnalyzingRaw record) {
        return geAnalyzingRawMapper.insert(record);
    }

    @Override
    public GeAnalyzingRaw selectByPrimaryKey(Integer id) {
        return geAnalyzingRawMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeAnalyzingRaw> selectAll() {
        return geAnalyzingRawMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeAnalyzingRaw record) {
        return geAnalyzingRawMapper.updateByPrimaryKey(record);
    }
}
