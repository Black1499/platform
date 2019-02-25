package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeAnalyzingMapper;
import com.nf147.platform.entity.GeAnalyzing;
import com.nf147.platform.service.GeAnalyzingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周
 * // TODO: 2019/2/18
 *解读
 */
@Service
public class GeAnalyzingServiceImpl implements GeAnalyzingService {
    @Autowired
    private GeAnalyzingMapper geAnalyzingMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geAnalyzingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeAnalyzing record) {
        return geAnalyzingMapper.insert(record);
    }

    @Override
    public GeAnalyzing selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<GeAnalyzing> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(GeAnalyzing record) {
        return 0;
    }
}
