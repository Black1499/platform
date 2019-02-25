package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GePolicyCategoryMapper;
import com.nf147.platform.entity.GePolicyCategory;
import com.nf147.platform.service.GePolicyCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周
 * // TODO: 2019/2/18
 * 政策类型
 */
@Service
public class GePolicyCategoryServiceImpl implements GePolicyCategoryService {
    @Autowired
    private GePolicyCategoryMapper gePolicyCategoryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gePolicyCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GePolicyCategory record) {
        return gePolicyCategoryMapper.insert(record);
    }

    @Override
    public GePolicyCategory selectByPrimaryKey(Integer id) {
        return gePolicyCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GePolicyCategory> selectAll() {
        return gePolicyCategoryMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GePolicyCategory record) {
        return gePolicyCategoryMapper.updateByPrimaryKey(record);
    }
}
