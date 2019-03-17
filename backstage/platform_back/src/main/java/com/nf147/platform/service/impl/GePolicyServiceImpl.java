package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GePolicyMapper;
import com.nf147.platform.entity.GePolicy;
import com.nf147.platform.service.GePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周
 * // TODO: 2019/2/18
 *政策服务
 */
@Service
public class GePolicyServiceImpl implements GePolicyService {
    @Autowired
    private GePolicyMapper gePolicyMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gePolicyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GePolicy record) {
        return gePolicyMapper.insert(record);
    }

    @Override
    public GePolicy selectByPrimaryKey(Integer id) {
        return gePolicyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GePolicy> selectAll() {
        return gePolicyMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GePolicy record) {
        return gePolicyMapper.updateByPrimaryKey(record);
    }

    /**
     * lgj
     * // TODO: 2019/2/18
     *修改收藏数
     */
    @Override
    public int updateByFavor(Integer id) {
        return gePolicyMapper.updateByFavor(id);
    }

    /**
     * lgj
     * // TODO: 2019/2/18
     *修改评论数
     */
    @Override
    public int updateByComment(Integer id) {
        return gePolicyMapper.updateByComment(id);
    }

    @Override
    public int updataReadedTimes(Integer policyId) {
        return gePolicyMapper.updataReadedTimes(policyId);
    }

    @Override
    public int updataShareTimes(Integer policyId) {
        return gePolicyMapper.updataShareTimes(policyId);
    }

    @Override
    public int updatUpvoteTimes(Integer policyId) {
        return gePolicyMapper.updatUpvoteTimes(policyId);
    }
}
