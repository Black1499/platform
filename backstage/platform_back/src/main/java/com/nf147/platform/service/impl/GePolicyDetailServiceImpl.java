package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GePolicyDetailMapper;
import com.nf147.platform.dao.GePolicyMapper;
import com.nf147.platform.entity.GePolicy;
import com.nf147.platform.entity.GePolicyDetail;
import com.nf147.platform.service.GePolicyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 周勇
 * @date 2019/2/17
 */
@Service
public class GePolicyDetailServiceImpl implements GePolicyDetailService {

    @Autowired
    private GePolicyDetailMapper gePolicyDetailMapper;

    @Autowired
    private GePolicyMapper gePolicyMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gePolicyDetailMapper.deleteByPrimaryKey(id);
    }

    /**
     * 向政策结构表和政策表插入数据
     * // TODO: 2019/2/21
     *
     * @param record
     * @return
     */
    @Override
    public int insert(GePolicyDetail record) {
        if (record != null) {
            if (gePolicyDetailMapper.insert(record) == 1) {
                return gePolicyMapper.insert(new GePolicy(record.getId(), new Date()));
            }
            return 1;
        }
        return 0;
    }

    @Override
    public GePolicyDetail selectByPrimaryKey(Integer id) {
        return gePolicyDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GePolicyDetail> selectAll() {
        return gePolicyDetailMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GePolicyDetail record) {
        return gePolicyDetailMapper.updateByPrimaryKey(record);
    }

    /**
     * TODO: 2019/2/21
     * 修改政策的状态
     *
     * @param status 政策的状态
     * @param id     政策的编号
     * @return
     */
    @Override
    public int updataDetailStatus(String status, int id) {
        if ("草拟".equals(status) || "核实".equals(status) || "发布".equals(status) || "推送".equals(status)) {
            return gePolicyDetailMapper.updataDetailStatus(status, id);
        }
        return 0;
    }

    /**
     * 分页查询政策结构表和政策表
     * // TODO: 2019/2/21
     *
     * @param start    起始页
     * @param pageSize 每页的条数
     * @return
     */
    @Override
    public List<GePolicyDetail> findByPage(int start, int pageSize) {
        return gePolicyDetailMapper.findByPage((start - 1) * pageSize, pageSize);
    }
}
