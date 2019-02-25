package com.nf147.platform.service;

import com.nf147.platform.entity.GeSubscription;

import java.util.List;

public interface GeSubscriptionService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeSubscription record);

    GeSubscription selectByPrimaryKey(Integer id);

    List<GeSubscription> selectAll();

    int updateByPrimaryKey(GeSubscription record);
}