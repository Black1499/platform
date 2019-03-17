package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeEnterpriseNatureMapper;
import com.nf147.platform.entity.GeEnterpriseNature;
import com.nf147.platform.service.GeEnterpriseNatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 梁
 * // TODO: 2019/2/26
 * 企业性质
 */
@Service
public class GeEnterpriseNatureSeriveImpl implements GeEnterpriseNatureService {
    @Autowired
    private GeEnterpriseNatureMapper geEnterpriseNatureMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geEnterpriseNatureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeEnterpriseNature record) {
        return geEnterpriseNatureMapper.insert(record);
    }

    @Override
    public GeEnterpriseNature selectByPrimaryKey(Integer id) {
        return geEnterpriseNatureMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeEnterpriseNature> selectAll() {
        return geEnterpriseNatureMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeEnterpriseNature record) {
        return geEnterpriseNatureMapper.updateByPrimaryKey(record);
    }
}
