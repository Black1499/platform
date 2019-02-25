package com.nf147.platform.service.impl;

import com.nf147.platform.entity.GePolicyDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest()
public class GePolicyDetailServiceImplTest {

    @Autowired
    private GePolicyDetailServiceImpl gePolicyDetailService;

    @Test
    public void insert() {
        int insert = gePolicyDetailService.insert(new GePolicyDetail(1, "今年顺顺利利找到自己理想的工作"));
        System.out.println(insert);
    }

    @Test
    public void update(){
        System.out.println(gePolicyDetailService.updateByPrimaryKey(new GePolicyDetail(1, 2, "哈哈")));
    }

    @Test
    public void findByPage(){
        List<GePolicyDetail> byPage = gePolicyDetailService.findByPage(1, 1);
        System.out.println(byPage);
    }
}