package com.nf147.platform.dao;

import com.nf147.platform.entity.GePolicyCompliantNature;

import java.util.List;

public interface GePolicyCompliantNatureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyCompliantNature record);

    GePolicyCompliantNature selectByPrimaryKey(Integer id);

    List<GePolicyCompliantNature> selectAll();

    int updateByPrimaryKey(GePolicyCompliantNature record);
}