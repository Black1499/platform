package com.nf147.platform.dao;

import com.nf147.platform.entity.GeAnnouncement;

import java.util.List;

public interface GeAnnouncementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeAnnouncement record);

    GeAnnouncement selectByPrimaryKey(Integer id);

    List<GeAnnouncement> selectAll();

    int updateByPrimaryKey(GeAnnouncement record);
}