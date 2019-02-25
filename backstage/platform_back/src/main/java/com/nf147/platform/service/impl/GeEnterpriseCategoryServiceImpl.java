package com.nf147.platform.service.impl;

import com.nf147.platform.entity.GeEnterpriseCategory;
import com.nf147.platform.service.GeEnterpriseCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *周
 * // TODO: 2019/2/18
 *
 */
@Service
public class GeEnterpriseCategoryServiceImpl implements GeEnterpriseCategoryService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(GeEnterpriseCategory record) {
        return 0;
    }

    @Override
    public GeEnterpriseCategory selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<GeEnterpriseCategory> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(GeEnterpriseCategory record) {
        return 0;
    }
}
