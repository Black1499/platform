package com.nf147.platform.service;

import com.nf147.platform.entity.GePolicyCompliantNature;

import java.util.List;

public interface GePolicyCompliantNatureService {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyCompliantNature record);

    GePolicyCompliantNature selectByPrimaryKey(Integer id);

    List<GePolicyCompliantNature> selectAll();

    int updateByPrimaryKey(GePolicyCompliantNature record);
}