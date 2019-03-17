package com.nf147.platform.web;

import com.nf147.platform.entity.GeInstitution;
import com.nf147.platform.service.impl.GeInstitutionServiceImpl;
import com.nf147.platform.util.response.Constants;
import com.nf147.platform.util.response.JSONResponse;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GeInstitutionController {
    @Autowired
    private GeInstitutionServiceImpl geInstitutionService;

    /**
     * 添加政府事业单位表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @PostMapping("/institution/insert")
    public JSONResponse insertInstitution(@RequestBody GeInstitution geInstitution) {
        try {
            if (geInstitution != null) {
                int result = geInstitutionService.insert(geInstitution);
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
     * 查询政府事业单位表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/institution/select")
    public JSONResponse selectInstitution() {
        try {
            List<GeInstitution> result = geInstitutionService.selectAll();
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
     * 修改政府事业单位表数据
     * @author 梁光健
     * @// TODO: 2019/02/26
     * */
    @PostMapping("/institution/update")
    public JSONResponse updateInstitution(@RequestBody GeInstitution geInstitution){
        try {
            if (geInstitution != null) {
                int result = geInstitutionService.updateByPrimaryKey(geInstitution);
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

    /**
     * 查询政府事业单位表数据
     *
     * @author 梁光健
     * @// TODO: 2019/02/26
     */
    @GetMapping("/institution/delete")
    public JSONResponse deleteInstitution(Integer id) {
        try {
            int result = geInstitutionService.deleteByPrimaryKey(id);
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
