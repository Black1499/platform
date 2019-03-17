package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeEnterpriseScaleMapper;
import com.nf147.platform.entity.GeEnterpriseScale;
import com.nf147.platform.service.GeEnterpriseScaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 梁
 * // TODO: 2019/2/26
 * 企业规模
 */
@Service
public class GeEnterpriseScaleServiceImpl implements GeEnterpriseScaleService {
    @Autowired
    private GeEnterpriseScaleMapper geEnterpriseScaleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geEnterpriseScaleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeEnterpriseScale record) {
        return geEnterpriseScaleMapper.insert(record);
    }

    @Override
    public GeEnterpriseScale selectByPrimaryKey(Integer id) {
        return geEnterpriseScaleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeEnterpriseScale> selectAll() {
        return geEnterpriseScaleMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeEnterpriseScale record) {
        return 0;
    }
}
