package com.nf147.platform.service;

import com.nf147.platform.entity.GePolicy;

import java.util.List;
/**
 * @author DZ 
 * // TODO: 2019/3/8  
 * */
public interface GePolicyService {
    /**
     * @param id
     * @return int
     * */
    int deleteByPrimaryKey(Integer id);

    /**
     * @param record
     * @return int
     * */
    int insert(GePolicy record);

    /**
     * @param id
     * @return GePolicy
     * */
    GePolicy selectByPrimaryKey(Integer id);
    /**
     *
     * @return List<GePolicy>
     * */
    List<GePolicy> selectAll();
    /**
     * 修改
     * @param record
     * @return int
     * */
    int updateByPrimaryKey(GePolicy record);
    /**
     * 修改
     * @param id
     * @return int
     * */
    int updateByFavor(Integer id);
    /**
     * 修改
     * @param id
     * @return int
     * */
    int updateByComment(Integer id);
    /**
     * 修改
     * @param policyId
     * @return int
     * */
    int updataReadedTimes(Integer policyId);
    /**
     * 修改
     * @param policyId
     * @return int
     * */
    int updataShareTimes(Integer policyId);
    /**
     * 修改
     * @param policyId
     * @return int
     * */
    int updatUpvoteTimes(Integer policyId);
}