package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeEnterpriseMapper;
import com.nf147.platform.entity.GeEnterprise;
import com.nf147.platform.service.GeEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周
 * // TODO: 2019/2/18
 *企业信息
 */
@Service
public class GeEnterpriseServiceImpl implements GeEnterpriseService {
    @Autowired
    private GeEnterpriseMapper geEnterpriseMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geEnterpriseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeEnterprise record) {
        return geEnterpriseMapper.insert(record);
    }

    @Override
    public GeEnterprise selectByPrimaryKey(Integer id) {
        return geEnterpriseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeEnterprise> selectAll() {
        return geEnterpriseMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeEnterprise record) {
        return geEnterpriseMapper.updateByPrimaryKey(record);
    }
}
