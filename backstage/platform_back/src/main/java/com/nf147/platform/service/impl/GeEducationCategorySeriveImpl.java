package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeEducationCategoryMapper;
import com.nf147.platform.entity.GeEducationCategory;
import com.nf147.platform.service.GeEducationCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeEducationCategorySeriveImpl implements GeEducationCategoryService {
    @Autowired
    private GeEducationCategoryMapper educationCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return educationCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeEducationCategory record) {
        return educationCategoryMapper.insert(record);
    }

    @Override
    public GeEducationCategory selectByPrimaryKey(Integer id) {
        return educationCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeEducationCategory> selectAll() {
        return educationCategoryMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeEducationCategory record) {
        return educationCategoryMapper.updateByPrimaryKey(record);
    }
}
