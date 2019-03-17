package com.nf147.platform.web;

import com.nf147.platform.entity.GeEducationCategory;
import com.nf147.platform.service.impl.GeEducationCategorySeriveImpl;
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
 * @info 学历类型
 * @// TODO: 2019/02/26
 */
@RestController
public class GeEducationCategoryController {

    @Autowired
    private GeEducationCategorySeriveImpl educationCategoryService;

    /**
     * 添加学历类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/education/insert")
    public JSONResponse insertEducation(@RequestBody GeEducationCategory geEducationCategory) {
        try {
            if (geEducationCategory != null) {
                int result = educationCategoryService.insert(geEducationCategory);
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
     * 查询学历类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/education/select")
    public JSONResponse selectEducation() {
        try {
            List<GeEducationCategory> result = educationCategoryService.selectAll();
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
     * 修改学历类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/education/update")
    public JSONResponse updateEducation(@RequestBody GeEducationCategory geEducationCategory) {
        try {
            if (geEducationCategory != null) {
                int result = educationCategoryService.updateByPrimaryKey(geEducationCategory);
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
     * 删除学历类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/education/delete")
    public JSONResponse deleteEducation(Integer id) {
        try {
            int result = educationCategoryService.deleteByPrimaryKey(id);
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
