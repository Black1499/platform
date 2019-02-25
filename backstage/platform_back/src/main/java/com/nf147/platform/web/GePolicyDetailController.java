package com.nf147.platform.web;

import com.nf147.platform.entity.GePolicyDetail;
import com.nf147.platform.service.impl.GePolicyDetailServiceImpl;
import com.nf147.platform.util.response.Constants;
import com.nf147.platform.util.response.JSONResponse;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张东明
 * @info 政策结构化
 * @date 2019/2/21
 */
@RestController
public class GePolicyDetailController {

    @Autowired
    private GePolicyDetailServiceImpl gePolicyDetailService;

    /**
     * @info /policy/insert 向政策结构表插入数据
     * @remark over
     */
    @PostMapping("/policy/detail/insert")
    public JSONResponse insertDetail(@RequestBody GePolicyDetail gePolicyDetail) {
        try {
            if (gePolicyDetail != null) {
                int result = gePolicyDetailService.insert(gePolicyDetail);
                if (result > 0) {
                    return JSONResponse.OK(Constants.SUCCESS_200, result);
                }
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
        return JSONResponse.ERROR(Constants.SUCCESS_202);
    }

    /**
     * @info /policy/detail/updateInfo 修改政策结构表的信息
     * @remark √
     */
    @PostMapping("/policy/detail/updateInfo")
    public JSONResponse updateDetail(@RequestBody GePolicyDetail gePolicyDetail) {
        try {
            if (gePolicyDetail != null) {
                int result = gePolicyDetailService.updateByPrimaryKey(gePolicyDetail);
                if (result > 0) {
                    return JSONResponse.OK(Constants.SUCCESS_200, result);
                }
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
        return JSONResponse.ERROR(Constants.SUCCESS_202);
    }

    /**
     * @info /policy/detail/updateStatus 修改政策结构表的状态
     * @remark √
     */
    @PostMapping("/policy/detail/updateStatus")
    public JSONResponse updateByDetailStatus(@RequestBody GePolicyDetail gePolicyDetail) {
        try {
            if (gePolicyDetail != null) {
                int result = gePolicyDetailService.updataDetailStatus(gePolicyDetail.getStatus(), gePolicyDetail.getId());
                if (result > 0) {
                    return JSONResponse.OK(Constants.SUCCESS_200, result);
                }
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
        return JSONResponse.ERROR(Constants.SUCCESS_202);
    }

    /**
     * @info /policy/getByPager/{parameter} 分页查询政策结构表和政策表
     * @remark √
     */
    @GetMapping("/policy/Detail/getByPager/{start}/{number}")
    public JSONResponse getByPolicyRawPager(@PathVariable("start") int start, @PathVariable("number") int number) {
        try {
            if (start > 0 && number > 0) {
                return JSONResponse.OK(Constants.SUCCESS_200, gePolicyDetailService.findByPage(start, number));
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
        return JSONResponse.ERROR(Constants.SUCCESS_202);
    }
}
