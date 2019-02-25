package com.nf147.platform.dao;

import com.nf147.platform.entity.GeSubscription;

import java.util.List;

public interface GeSubscriptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeSubscription record);

    GeSubscription selectByPrimaryKey(Integer id);

    List<GeSubscription> selectAll();

    int updateByPrimaryKey(GeSubscription record);
}