package com.nf147.platform.dao;

import com.nf147.platform.entity.GePolicyRaw;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GePolicyRawMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyRaw record);

    List<GePolicyRaw> selectAll();

    int updateByPrimaryKey(GePolicyRaw record);

    /**
     * TODO: 2019/2/21
     * 修改原始政策表的状态
     * @param status    政策的状态
     * @param id   政策的编号
     * @return
     */
    int updataRawStatus(@Param("status") String status, @Param("id") int id);

    /**
     * 分页查询原始政策表
     * // TODO: 2019/2/21
     * @param start 起始页
     * @param pageSize  每页的条数
     * @return
     */
    List<GePolicyRaw> findByPage(@Param("start") int start, @Param("pageSize") int pageSize);
}