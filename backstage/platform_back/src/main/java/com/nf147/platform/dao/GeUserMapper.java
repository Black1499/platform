package com.nf147.platform.dao;

import com.nf147.platform.entity.GeUser;

import java.util.List;

/**
 * @author 陈卓悦
 */
public interface GeUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeUser record);

    GeUser selectByPrimaryKey(Integer id);

    List<GeUser> selectAll();

    int updateByPrimaryKey(GeUser record);

    /**
     * 通过账号搜索用户
     * @param number
     * @return
     */
    public GeUser selectByNumber(String number);
}