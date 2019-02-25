package com.nf147.platform.service;

import com.nf147.platform.entity.GeAnnouncement;

import java.util.List;

public interface GeAnnouncementService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeAnnouncement record);

    GeAnnouncement selectByPrimaryKey(Integer id);

    List<GeAnnouncement> selectAll();

    int updateByPrimaryKey(GeAnnouncement record);
}