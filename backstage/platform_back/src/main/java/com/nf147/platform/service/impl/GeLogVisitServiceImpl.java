package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeLogVisitMapper;
import com.nf147.platform.entity.GeLogVisit;
import com.nf147.platform.service.GeLogVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 张东明
 * // TODO: 2019/3/4
 *
 * @remark
 */
@Service
public class GeLogVisitServiceImpl implements GeLogVisitService {

    @Autowired
    private GeLogVisitMapper geLogVisitMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(GeLogVisit record) {
        return geLogVisitMapper.insert(record);
    }

    @Override
    public GeLogVisit selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<GeLogVisit> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(GeLogVisit record) {
        return 0;
    }
}
