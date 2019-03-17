package com.nf147.platform.web;

import com.nf147.platform.entity.*;
import com.nf147.platform.service.impl.*;
import com.nf147.platform.util.response.Constants;
import com.nf147.platform.util.response.JSONResponse;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张东明
 * @info 政策
 * @date 20192/21
 */
@RestController
public class GePolicyController {

    @Autowired
    private GePolicyServiceImpl gePolicyService;

    @Autowired
    private GeFavorServiceImpl geFavorService;

    @Autowired
    private GeCommentServiceImpl geCommentService;

    @Autowired
    private GeShareServiceImpl geShareService;

    @Autowired
    private GeReadServiceImpl geReadService;

    @Autowired
    private GeUpvoteServiceImpl geUpvoteService;

    /**
     * /policy/insert 向政策结构表插入数据
     *
     * @remark √
     * @// TODO: 2019/2/26
     */
    @PostMapping("/policy/insert")
    public JSONResponse insertDetail(@RequestBody GePolicy gePolicy) {
        try {
            if (gePolicy != null) {
                int result = gePolicyService.insert(gePolicy);
                if (result > 0) {
                    return JSONResponse.OK(Constants.SUCCESS_200, "添加成功");
                }
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
        return null;
    }

    /**
     * @author 张东明
     * @remark 修改政策表阅读数，同时向阅读表插入一条数据
     * @// TODO: 2019/2/26
     */
    @PostMapping("/policy/read")
    public JSONResponse updatePolicyAndAddRead(@RequestBody GeRead geRead) {
        try {
            if (geRead != null && geRead.getUserId() != null && geRead.getUserId() > 0) {
                int insert = geReadService.insert(geRead);
                if(insert > 0){
                    return JSONResponse.OK(Constants.SUCCESS_200);
                }else{
                    return JSONResponse.OK(Constants.SUCCESS_202);
                }
            }else{
                return JSONResponse.OK(Constants.SUCCESS_204);
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
    }

    /**
     * @author 张东明
     * @remark 修改政策表分享数，同时向分享表插入一条数据
     * @// TODO: 2019/2/26
     */
    @PostMapping("/policy/shared")
    public JSONResponse updatePolicyAndAddShared(@RequestBody GeShare geShare) {
        try {
            if (geShare != null && geShare.getUserId() != null && geShare.getUserId() > 0) {
                int insert = geShareService.insert(geShare);
                if(insert > 0){
                    return JSONResponse.OK(Constants.SUCCESS_200);
                }else{
                    return JSONResponse.OK(Constants.SUCCESS_202);
                }
            }else{
                return JSONResponse.OK(Constants.SUCCESS_204);
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
    }

    /**
     * @author 张东明
     * @remark 修改政策表点赞数，同时向点赞表插入一条数据
     * @// TODO: 2019/2/26
     */
    @PostMapping("/policy/upvote")
    public JSONResponse updatePolicyAndAddUpvote(@RequestBody GeUpvote geUpvote) {
        try {
            if (geUpvote != null && geUpvote.getUserId() != null && geUpvote.getUserId() > 0) {
                int insert = geUpvoteService.insert(geUpvote);
                if(insert > 0){
                  return JSONResponse.OK(Constants.SUCCESS_200);
                }else{
                    return JSONResponse.OK(Constants.SUCCESS_202);
                }
            }else{
                return JSONResponse.OK(Constants.SUCCESS_204);
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
    }

    /**
     * @author 张东明
     * @remark 修改政策表收藏数，同时向收藏表插入一条数据
     * @// TODO: 2019/2/26
     */
    @PostMapping("/policy/favor")
    public JSONResponse updatePolicyAndAddFavor(@RequestBody GeFavor geFavor) {
        try {
            if (geFavor != null && geFavor.getUserId() != null && geFavor.getUserId() > 0) {
                int i = gePolicyService.updateByFavor(geFavor.getPolicyId());
                if(i > 0){
                    int insert = geFavorService.insert(geFavor);
                    if(insert > 0){
                        return  JSONResponse.OK(Constants.SUCCESS_200,insert);
                    }else{
                        return  JSONResponse.OK(Constants.SUCCESS_202,"添加失败，请联系管理员");
                    }
                }else{
                    return  JSONResponse.OK(Constants.SUCCESS_202,"修改失败，请联系管理员");
                }
            }else{
                return  JSONResponse.OK(Constants.SUCCESS_204,"修改失败，请联系管理员");
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
    }

    /**
     * @author 张东明
     * @remark 修改政策表评论数，同时向评论表插入一条数据
     * @// TODO: 2019/2/26
     */
    @PostMapping("/policy/comment")
        public JSONResponse updatePolicyAndAddComment(@RequestBody GeComment geComment) {
            try {
                if (geComment != null && geComment.getUserId() != null && geComment.getUserId() > 0) {
                    int i = gePolicyService.updateByComment(geComment.getPolicyId());
                    if(i > 0){
                        int insert = geCommentService.insert(geComment);
                        if(insert > 0){
                            return  JSONResponse.OK(Constants.SUCCESS_200,"添加成功");
                        }else{
                            return  JSONResponse.OK(Constants.SUCCESS_202,"添加失败，请联系管理员");
                        }
                    }else{
                        return  JSONResponse.OK(Constants.SUCCESS_202,"修改失败，请联系管理员");
                    }
                }
            } catch (MyBatisSystemException ex) {
                return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
            } catch (Exception ex) {
                return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
            }
            return null;
    }

}
