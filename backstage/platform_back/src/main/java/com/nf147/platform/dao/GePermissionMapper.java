package com.nf147.platform.dao;



import com.nf147.platform.entity.GePermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 陈卓悦
 */
public interface GePermissionMapper {
    /**
     * 查询全部
     * @return
     */
    public List<GePermission> findAll();

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    public GePermission selectByPrimaryKey(int id);

    /**
     * 根据主键更改
     * @param permission
     */
    public int updateByPrimaryKey(GePermission permission);

    /**
     * 根据主键删除
     * @param id
     */
    public int deleteByPrimaryKey(int id);

    /**
     * 添加一个权限
     * @param permission
     */
    public int insert(GePermission permission);

    /**
     * 查询角色的权限
     * @param roleId
     * @return
     */
    public List<GePermission> selectPermission(@Param("roleId") int roleId);


}
