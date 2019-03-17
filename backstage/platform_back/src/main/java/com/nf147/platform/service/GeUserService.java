package com.nf147.platform.service;

import com.nf147.platform.entity.GeUser;

import java.util.List;

/**
 * @author 陈卓悦
 */
public interface GeUserService {

    int deleteByPrimaryKey(Integer id);

    int insert(GeUser record);

    GeUser selectByPrimaryKey(Integer id);

    List<GeUser> selectAll();

    int updateByPrimaryKey(GeUser record);

    GeUser selectByNumber(String number);

    /**
     * 保存user登录信息，返回token
     * @param number
     */
    public String generateJwtToken(String number);


    /**
     * 获取用户角色列表,以及从数据库中查询
     * @param id
     * @return
     */
    public List<String> getUserRole(int id);

}