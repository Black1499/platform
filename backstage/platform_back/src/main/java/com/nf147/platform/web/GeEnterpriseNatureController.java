package com.nf147.platform.web;

import com.nf147.platform.entity.GeEnterpriseNature;
import com.nf147.platform.service.impl.GeEnterpriseNatureSeriveImpl;
import com.nf147.platform.util.response.Constants;
import com.nf147.platform.util.response.JSONResponse;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 梁光健
 * @info 企业性质
 * @// TODO: 2019/02/26
 */
@RestController
public class GeEnterpriseNatureController {
    @Autowired
    private GeEnterpriseNatureSeriveImpl geEnterpriseNatureService;

    /**
     * 添加企业性质表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/nature/insert")
    public JSONResponse insertNature(@RequestBody GeEnterpriseNature geEnterpriseNature) {
        try {
            if (geEnterpriseNature != null) {
                int result = geEnterpriseNatureService.insert(geEnterpriseNature);
                if (result > 0) {
                    return JSONResponse.OK(Constants.SUCCESS_200, result);
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
     * 查询企业性质表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/nature/select")
    public JSONResponse selectNature() {
        try {
            List<GeEnterpriseNature> result = geEnterpriseNatureService.selectAll();
            if (result != null) {
                return JSONResponse.OK(Constants.SUCCESS_200, result);
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
        return null;
    }

    /**
     * 修改企业性质表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/nature/update")
    public JSONResponse updateNature(@RequestBody GeEnterpriseNature geEnterpriseNature) {
        try {
            if (geEnterpriseNature != null) {
                int result = geEnterpriseNatureService.updateByPrimaryKey(geEnterpriseNature);
                if (result > 0) {
                    return JSONResponse.OK(Constants.SUCCESS_200, result);
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
     * 删除企业性质表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/nature/delete")
    public JSONResponse deleteNature(Integer id) {
        try {
            int result = geEnterpriseNatureService.deleteByPrimaryKey(id);
            if (result > 0) {
                return JSONResponse.OK(Constants.SUCCESS_200, result);
            }
        } catch (MyBatisSystemException ex) {
            return JSONResponse.ERROR(Constants.ERROR_500, ex.getMessage());
        } catch (Exception ex) {
            return JSONResponse.ERROR(Constants.ERROR_408, ex.getMessage());
        }
        return null;
    }
}
