package com.nf147.platform.dao;

import com.nf147.platform.entity.GeRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 陈卓悦
 */
public interface GeRoleMapper {
    /**
     * 查询全部
     * @return
     */
    public List<GeRole> findAll();

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    public GeRole selectByPrimaryKey(int id);

    /**
     * 根据主键更改
     * @param role
     */
    public int updateByPrimaryKey(GeRole role);

    /**
     * 根据主键删除
     * @param id
     */
    public int deleteByPrimaryKey(int id);

    /**
     * 添加一个用户
     * @param role
     */
    public int insert(GeRole role);

}
