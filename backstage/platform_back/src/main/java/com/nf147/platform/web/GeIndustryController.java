package com.nf147.platform.web;

import com.nf147.platform.entity.GeIndustry;
import com.nf147.platform.service.impl.GeIndustryServiceImpl;
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
 * @info 国民经济行业
 * @// TODO: 2019/02/26
 */
@RestController
public class GeIndustryController {
    @Autowired
    private GeIndustryServiceImpl geIndustryService;

    /**
     * 添加国民经济行业表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/industry/insert")
    public JSONResponse insertIndustry(@RequestBody GeIndustry geIndustry) {
        try {
            if (geIndustry != null) {
                int result = geIndustryService.insert(geIndustry);
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
     * 查询国民经济行业表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/industry/select")
    public JSONResponse selectIndustry() {
        try {
            List<GeIndustry> result = geIndustryService.selectAll();
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
     * 修改国民经济行业表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/industry/update")
    public JSONResponse updateIndustry(@RequestBody GeIndustry geIndustry) {
        try {
            if (geIndustry != null) {
                int result = geIndustryService.updateByPrimaryKey(geIndustry);
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
     * 删除国民经济行业表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/industry/delete")
    public JSONResponse deleteIndustry(Integer id) {
        try {
            int result = geIndustryService.deleteByPrimaryKey(id);
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
