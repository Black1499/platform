package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeUserMapper;
import com.nf147.platform.entity.GePermission;
import com.nf147.platform.entity.GeUser;
import com.nf147.platform.service.GeUserService;
import com.nf147.platform.shiro.JwtUtils;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * @author 陈卓悦
 */
@Service
public class GeUserServiceImpl implements GeUserService {

    @Autowired
    private GeUserMapper geUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeUser record) {
        return geUserMapper.insert(record);
    }

    @Override
    public GeUser selectByPrimaryKey(Integer id) {
        return geUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeUser> selectAll() {
        return geUserMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeUser record) {
        return geUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public GeUser selectByNumber(String number) {
        return geUserMapper.selectByNumber(number);
    }

    @Override
    public String generateJwtToken(String number) {
        GeUser user = geUserMapper.selectByNumber(number);
        return JwtUtils.sign(user.getNumber() , String.valueOf(ByteSource.Util.bytes(number)), 3600);
    }


    @Override
    public List<String> getUserRole(int id) {
        GeUser user = geUserMapper.selectByPrimaryKey(id);
        List<GePermission> permissionsList = user.getRole().getPermissionList();
        List<String> list = new ArrayList<>();
        for (GePermission p : permissionsList){
            list.add(p.getMenu());
        }
        return list;
    }
}
