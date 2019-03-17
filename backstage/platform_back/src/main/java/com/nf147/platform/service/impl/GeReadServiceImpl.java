package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GePolicyMapper;
import com.nf147.platform.dao.GeReadMapper;
import com.nf147.platform.entity.GeRead;
import com.nf147.platform.service.GeReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhou
 * // TODO: 2019/2/25
 * @info 阅读表
 */
@Service
public class GeReadServiceImpl implements GeReadService {
    @Autowired
    private GeReadMapper geReadMapper;

    @Autowired
    private GePolicyMapper gePolicyMapper;

    /**
     * // TODO: 2019/2/26
     * 根据id删除（暂不使用）
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        if (id != null){
            return geReadMapper.deleteByPrimaryKey(id);
        }
        return 0;
    }

    /**
     * // TODO: 2019/2/25
     * @info  插入阅读表数据
     * @param record
     * @return
     */
    @Override
    public int insert(GeRead record) {
        if (record != null){
            int insert = geReadMapper.insert(record);
            if (insert == 1 && record.getPolicyId() > 0){
                int i = gePolicyMapper.updataReadedTimes(record.getPolicyId());
                return i;
            }
            return insert;
        }
        return 0;
    }

    /**
     * // TODO: 2019/2/26
     * @info 根据id查询
     * @param id
     * @return
     */
    @Override
    public GeRead selectByPrimaryKey(Integer id) {
        if (id != null){
            return geReadMapper.selectByPrimaryKey(id);
        }
        return null;
    }

    /**
     * // TODO: 2019/2/26
     * 查询所有阅读的数据
     * @return
     */
    @Override
    public List<GeRead> selectAll() {
        return geReadMapper.selectAll();
    }

    /**
     * // TODO: 2019/2/25
     * @info  修改阅读表数据
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(GeRead record) {
        if(record != null){
            int i = geReadMapper.updateByPrimaryKey(record);
            if (i == 1){
                return 1;
            }
            return i;
        }
        return 0;
    }
}
