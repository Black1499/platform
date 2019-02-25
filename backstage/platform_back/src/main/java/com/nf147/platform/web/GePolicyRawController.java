package com.nf147.platform.web;

import com.nf147.platform.service.impl.GePolicyRawServiceImpl;
import com.nf147.platform.util.response.Constants;
import com.nf147.platform.util.response.JSONResponse;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张东明
 * @info 原始政策表控制层
 * @date 日期2019/2/20
 */
@RestController
public class GePolicyRawController {

    @Autowired
    private GePolicyRawServiceImpl gePolicyRawService;

    /**
     * @info /policy/raw/getByPager/{parameter}根据页码查询原始政策信息
     * @remark √
     */
    @GetMapping("/policy/raw/getByPager/{start}/{number}")
    public JSONResponse getByPolicyRawPager(@PathVariable("start") int start, @PathVariable("number") int number) {
        try {
            if (start > 0 && number >= 0) {
                return JSONResponse.OK(Constants.SUCCESS_200, gePolicyRawService.findByPage(start, number));
            } else {
                return JSONResponse.ERROR(Constants.SUCCESS_202);
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
    }

    /**
     * @info /policy/raw/updateStatus/{parameter}修改原始政策信息
     * @remark √
     */
    @GetMapping("/policy/raw/updateStatus/{status}/{id}")
    public JSONResponse updateByRamStatus(@PathVariable("status") String status, @PathVariable("id") int id) {
        try {
            if (status != null && status != "" && id > 0) {
                int i = gePolicyRawService.updataRawStatus(status, id);
                if (i > 0) {
                    return JSONResponse.OK(Constants.SUCCESS_200,i);
                }
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
        return JSONResponse.ERROR(Constants.SUCCESS_202);
    }
}
