package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeFavorMapper;
import com.nf147.platform.entity.GeFavor;
import com.nf147.platform.service.GeFavorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 梁
 * // TODO: 2019/2/25
 * 收藏
 */
@Service
public class GeFavorServiceImpl implements GeFavorService {

    @Autowired
    private GeFavorMapper geFavorMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geFavorMapper.deleteByPrimaryKey(id);
    }

    /**
     * 梁
     * // TODO: 2019/2/25
     * 添加收藏数量
     */
    @Override
    public int insert(GeFavor record) {
        if (record != null) {
            if (geFavorMapper.insert(record) == 1) {
                return geFavorMapper.insert(record);
            }
            return 1;
        }
        return 0;
    }

    @Override
    public GeFavor selectByPrimaryKey(Integer id) {
        return geFavorMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GeFavor> selectAll() {
        return geFavorMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeFavor record) {
        return geFavorMapper.updateByPrimaryKey(record);
    }
}
