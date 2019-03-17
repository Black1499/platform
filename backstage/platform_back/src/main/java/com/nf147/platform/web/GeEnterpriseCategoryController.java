package com.nf147.platform.web;

import com.nf147.platform.entity.GeEnterpriseCategory;
import com.nf147.platform.service.impl.GeEnterpriseCategoryServiceImpl;
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
 * @info 企业类型
 * @// TODO: 2019/02/26
 */

@RestController
public class GeEnterpriseCategoryController {
    @Autowired
    private GeEnterpriseCategoryServiceImpl categoryService;

    /**
     * 添加企业类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/enterprise/insert")
    public JSONResponse insertEnterprise(@RequestBody GeEnterpriseCategory geEnterpriseCategory) {
        try {
            if (geEnterpriseCategory != null) {
                int result = categoryService.insert(geEnterpriseCategory);
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
     * 查询企业类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/enterprise/select")
    public JSONResponse selectEnterprise() {
        try {
            List<GeEnterpriseCategory> result = categoryService.selectAll();
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
     * 修改企业类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/enterprise/update")
    public JSONResponse updateEnterprise(@RequestBody GeEnterpriseCategory geEnterpriseCategory) {
        try {
            if (geEnterpriseCategory != null) {
                int result = categoryService.updateByPrimaryKey(geEnterpriseCategory);
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
     * 删除企业类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/enterprise/delete")
    public JSONResponse deleteEnterprise(Integer id) {
        try {
            int result = categoryService.deleteByPrimaryKey(id);
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
