package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeAnnouncementMapper;
import com.nf147.platform.entity.GeAnnouncement;
import com.nf147.platform.service.GeAnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhou
 * // TODO: 2019/2/18
 *公告
 */
@Service
public class GeAnnouncementServiceImpl implements GeAnnouncementService {
    @Autowired
    private GeAnnouncementMapper geAnnouncementMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geAnnouncementMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GeAnnouncement record) {
        return geAnnouncementMapper.insert(record);
    }

    @Override
    public GeAnnouncement selectByPrimaryKey(Integer id) {
        return geAnnouncementMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeAnnouncement> selectAll() {
        return geAnnouncementMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeAnnouncement record) {
        return geAnnouncementMapper.updateByPrimaryKey(record);
    }
}
