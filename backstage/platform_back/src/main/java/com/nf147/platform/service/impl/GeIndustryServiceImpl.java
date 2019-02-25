package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeIndustryMapper;
import com.nf147.platform.entity.GeIndustry;
import com.nf147.platform.service.GeIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周
 * // TODO: 2019/2/18
 * 国名经济行业
 */
@Service
public class GeIndustryServiceImpl implements GeIndustryService {
    @Autowired
    private GeIndustryMapper geIndustryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geIndustryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeIndustry record) {
        return geIndustryMapper.insert(record);
    }

    @Override
    public GeIndustry selectByPrimaryKey(Integer id) {
        return geIndustryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeIndustry> selectAll() {
        return geIndustryMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeIndustry record) {
        return geIndustryMapper.updateByPrimaryKey(record);
    }
}
