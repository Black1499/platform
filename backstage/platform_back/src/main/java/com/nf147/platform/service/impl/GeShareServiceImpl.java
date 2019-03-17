package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GePolicyMapper;
import com.nf147.platform.dao.GeShareMapper;
import com.nf147.platform.entity.GeShare;
import com.nf147.platform.service.GeShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * // TODO: 2019/2/26
 * @author zhou
 * @info 分享表
 */
@Service
public class GeShareServiceImpl implements GeShareService {

    @Autowired
    private GeShareMapper geShareMapper;

    @Autowired
    private GePolicyMapper gePolicyMapper;

    /**
     * 删除（暂不使用）
     * // TODO: 2019/2/26
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return geShareMapper.deleteByPrimaryKey(id);
    }

    /**
     * // TODO: 2019/2/26
     * @info   插入分享表数据
     * @param record
     * @return
     */
    @Override
    public int insert(GeShare record) {
        if (record != null){
            int insert = geShareMapper.insert(record);
            if (insert == 1 && record.getPolicyId() > 0){
                int i = gePolicyMapper.updataShareTimes(record.getPolicyId());
                return i;
            }
        }
        return 0;
    }

    /**
     * // TODO: 2019/2/26
     * @info  根据ID查询数据
     * @param id
     * @return
     */
    @Override
    public GeShare selectByPrimaryKey(Integer id) {
        if (id != null){
            return  geShareMapper.selectByPrimaryKey(id);
        }
        return null;
    }

    /**
     * // TODO: 2019/2/26
     * @info 查询所有数据
     * @return
     */
    @Override
    public List<GeShare> selectAll() {
        return geShareMapper.selectAll();
    }

    /**
     * // TODO: 2019/2/26
     * @info 修改分享表的数据
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(GeShare record) {
        if (record != null){
            return geShareMapper.updateByPrimaryKey(record);
        }
        return 0;
    }
}
