package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GePolicyRawMapper;
import com.nf147.platform.entity.GePolicyRaw;
import com.nf147.platform.service.GePolicyRawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周周
 * // TODO: 2019/2/17
 *原始政策
 */
@Service
public class GePolicyRawServiceImpl implements GePolicyRawService {

    @Autowired
    private GePolicyRawMapper gePolicyRawMapper;

    /**
     * 根据id删除政策
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gePolicyRawMapper.deleteByPrimaryKey(id);
    }

    /**
     * 插入原始政策
     * @param record
     * @return
     */
    @Override
    public int insert(GePolicyRaw record) {
        return gePolicyRawMapper.insert(record);
    }

    /**查询所有原始政策
     * @return
     */
    @Override
    public List<GePolicyRaw> selectAll() {
        return gePolicyRawMapper.selectAll();
    }

    /**
     * 修改政策
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(GePolicyRaw record) {
        return gePolicyRawMapper.updateByPrimaryKey(record);
    }

    /**
     * 修改原始政策表的状态
     * @param status 状态
     * @param id
     * @return
     */
    @Override
    public int updataRawStatus(String status, int id) {
        if ("处理".equals(status)){
            return gePolicyRawMapper.updataRawStatus(status, id);
        }
        return 0;
    }

    /**
     * 分页查询原始政策表
     * // TODO: 2019/2/21
     * @param start 起始页
     * @param pageSize  每页的条数
     * @return
     */
    @Override
    public List <GePolicyRaw> findByPage(int start, int pageSize) {
        List <GePolicyRaw> gePolicyRaws = gePolicyRawMapper.findByPage((start-1)*pageSize, pageSize);
        return gePolicyRaws;
    }
}
