package com.nf147.platform.dao;

import com.nf147.platform.entity.GePolicyDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GePolicyDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyDetail record);

    GePolicyDetail selectByPrimaryKey(Integer id);

    List<GePolicyDetail> selectAll();

    int updateByPrimaryKey(GePolicyDetail record);
    
    /**
     * TODO: 2019/2/21
     * 修改政策表的状态
     * @param status    政策的状态
     * @param id   政策的编号
     * @return
     */
    int updataDetailStatus(@Param("status") String status, @Param("id") int id);

    /**
     * 分页查询政策结构表和政策表
     * // TODO: 2019/2/21
     * @param start 起始页
     * @param pageSize  每页的条数
     * @return
     */
    List<GePolicyDetail> findByPage(@Param("start") int start, @Param("pageSize") int pageSize);

}