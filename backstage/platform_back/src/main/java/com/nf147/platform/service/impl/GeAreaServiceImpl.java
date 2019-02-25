package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeAreaMapper;
import com.nf147.platform.entity.GeArea;
import com.nf147.platform.service.GeAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * // TODO: 2019/2/18
 * 地区
 */
@Service
public class GeAreaServiceImpl implements GeAreaService {

    @Autowired
    private GeAreaMapper geAreaMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geAreaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeArea record) {
        return geAreaMapper.insert(record);
    }

    @Override
    public GeArea selectByPrimaryKey(Integer id) {
        return geAreaMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeArea> selectAll() {
        return geAreaMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeArea record) {
        return geAreaMapper.updateByPrimaryKey(record);
    }
}
