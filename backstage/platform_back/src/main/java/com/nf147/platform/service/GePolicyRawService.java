package com.nf147.platform.service;

import com.nf147.platform.entity.GePolicyRaw;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GePolicyRawService {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyRaw record);

    List<GePolicyRaw> selectAll();

    int updateByPrimaryKey(GePolicyRaw record);

    int updataRawStatus(@Param("status") String status, @Param("id") int id);

    List<GePolicyRaw> findByPage(int start, int pageSize);
}