package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeEnterpriseCategoryMapper;
import com.nf147.platform.entity.GeEnterpriseCategory;
import com.nf147.platform.service.GeEnterpriseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *周
 * // TODO: 2019/2/18
 *
 */
@Service
public class GeEnterpriseCategoryServiceImpl implements GeEnterpriseCategoryService {
    @Autowired
    private GeEnterpriseCategoryMapper categoryMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeEnterpriseCategory record) {
        return categoryMapper.insert(record);
    }

    @Override
    public GeEnterpriseCategory selectByPrimaryKey(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeEnterpriseCategory> selectAll() {
        return categoryMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeEnterpriseCategory record) {
        return categoryMapper.updateByPrimaryKey(record);
    }
}
