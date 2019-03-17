package com.nf147.platform.web;

import com.nf147.platform.entity.GeComment;
import com.nf147.platform.service.GeCommentService;
import com.nf147.platform.util.response.Constants;
import com.nf147.platform.util.response.JSONResponse;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 梁光健
 * @info 评论
 * @// TODO: 2019/02/26
 */
@RestController
public class GeCommentController {
    @Autowired
    private GeCommentService geCommentService;

    /**
     * 添加评论表数据
     * @author 梁光健
     * @// TODO: 2019/02/26
     * */
    @PostMapping("/comment/insert")
    public JSONResponse insertComment(@RequestBody GeComment geComment){
        try {
            if (geComment != null) {
                int result = geCommentService.insert(geComment);
                if (result > 0) {
                    return  JSONResponse.OK(Constants.SUCCESS_200,result);
                }
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500,ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408,ex.getMessage());
        }
        return null;
    }
}
