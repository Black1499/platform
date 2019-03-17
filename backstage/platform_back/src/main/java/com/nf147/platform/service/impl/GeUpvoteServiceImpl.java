package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GePolicyMapper;
import com.nf147.platform.dao.GeUpvoteMapper;
import com.nf147.platform.entity.GeUpvote;
import com.nf147.platform.service.GeUpvoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhou 
 * // TODO: 2019/2/25  
 * 点赞表
 */
@Service
public class GeUpvoteServiceImpl implements GeUpvoteService {
    @Autowired
    private GeUpvoteMapper geUpvoteMapper;

    @Autowired
    private GePolicyMapper gePolicyMapper;

    /**
     * //TODO:2019/2/26
     * 根据ID删除(暂不使用)
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        if ( id != null){
            return geUpvoteMapper.deleteByPrimaryKey(id);
        }
        return 0;
    }

    /**
     * // TODO: 2019/2/26
     * @info 插入点赞表的数据
     * @param record
     * @return
     */
    @Override
    public int insert(GeUpvote record) {
        if(record != null){
            int insert = geUpvoteMapper.insert(record);
            if (insert == 1 && record.getPolicyId() > 0){
                int i = gePolicyMapper.updatUpvoteTimes(record.getPolicyId());
                return i;
            }
            return insert;
        }
        return 0;
    }

    /**
     * 根据Id查询数据
     * // TODO: 2019/2/26
     * @param id
     * @return
     */
    @Override
    public GeUpvote selectByPrimaryKey(Integer id) {
        if ( id != null) {
            return geUpvoteMapper.selectByPrimaryKey(id);
        }
        return null;
    }

    /**
     * // TODO: 2019/2/26
     * @info 查询所有数据
     * @return
     */
    @Override
    public List<GeUpvote> selectAll() {
        return geUpvoteMapper.selectAll();
    }

    /**
     * // TODO: 2019/2/26
     * @info 修改点赞表的数据
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(GeUpvote record) {
        if(record != null){
            int i = geUpvoteMapper.updateByPrimaryKey(record);
            if (i == 1) {
                return i;
            }
            return i;
        }
        return 0;
    }
}
