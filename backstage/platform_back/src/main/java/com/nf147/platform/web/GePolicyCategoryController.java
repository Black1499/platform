package com.nf147.platform.web;

import com.nf147.platform.entity.GePolicyCategory;
import com.nf147.platform.service.impl.GePolicyCategoryServiceImpl;
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
 * @info 政策类型
 * @// TODO: 2019/02/26
 */
@RestController
public class GePolicyCategoryController {
    @Autowired
    private GePolicyCategoryServiceImpl gePolicyCategoryService;

    /**
     * 添加政策类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/category/insert")
    public JSONResponse insertCategory(@RequestBody GePolicyCategory gePolicyCategory) {
        try {
            if (gePolicyCategory != null) {
                int result = gePolicyCategoryService.insert(gePolicyCategory);
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
     * 查询政策类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/category/select")
    public JSONResponse selectCategory() {
        try {
            List<GePolicyCategory> result = gePolicyCategoryService.selectAll();
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
     * 添加政策类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/category/update")
    public JSONResponse updateCategory(@RequestBody GePolicyCategory gePolicyCategory) {
        try {
            if (gePolicyCategory != null) {
                int result = gePolicyCategoryService.updateByPrimaryKey(gePolicyCategory);
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
     * 添加政策类型表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/category/delect")
    public JSONResponse delectCategory(Integer id) {
        try {
            int result = gePolicyCategoryService.deleteByPrimaryKey(id);
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
