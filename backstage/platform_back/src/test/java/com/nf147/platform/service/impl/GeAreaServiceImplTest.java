package com.nf147.platform.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
 *区域测试方法
 *日期2019/2/20
 *author 张东明
 * */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeAreaServiceImplTest {

    @Autowired
    private GeAreaServiceImpl geAreaService;

    @Test
    public void selectAll() {
        System.out.println(geAreaService.selectAll());
    }
}