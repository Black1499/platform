package com.nf147.platform.service;

import com.nf147.platform.entity.GePolicyDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GePolicyDetailService {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyDetail record);

    GePolicyDetail selectByPrimaryKey(Integer id);

    List<GePolicyDetail> selectAll();

    int updateByPrimaryKey(GePolicyDetail record);

    int updataDetailStatus(String status, int id);

    List<GePolicyDetail> findByPage(int start, int pageSize);

    /**
     * @param start 起始页
     * @param pageSize 条数
     * @param status 状态
     * @return Result List<GePolicyDetail></>
     * @author 张东明
     * //TODO: 2019/2/25
     * @remark: 根据状态查询政策结构表
     */
    List<GePolicyDetail> findByStatus(@Param("start") int start, @Param("pageSize") int pageSize, @Param("status") String status);

}