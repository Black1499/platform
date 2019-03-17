package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeInstitutionMapper;
import com.nf147.platform.entity.GeInstitution;
import com.nf147.platform.service.GeInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 梁
 * // TODO: 2019/2/26
 * 政府事业单位
 */
@Service
public class GeInstitutionServiceImpl implements GeInstitutionService {
    @Autowired
    private GeInstitutionMapper geInstitutionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geInstitutionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeInstitution record) {
        return geInstitutionMapper.insert(record);
    }

    @Override
    public GeInstitution selectByPrimaryKey(Integer id) {
        return geInstitutionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeInstitution> selectAll() {
        return geInstitutionMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeInstitution record) {
        return geInstitutionMapper.updateByPrimaryKey(record);
    }
}
