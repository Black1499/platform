package com.nf147.platform.web;

import com.nf147.platform.entity.GeArea;
import com.nf147.platform.service.impl.GeAreaServiceImpl;
import com.nf147.platform.util.response.Constants;
import com.nf147.platform.util.response.JSONResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @author 张东明
 * @info 区域控制层
 * @date 日期2019/2/20
 */
@RestController
public class GeAreaController {

    @Autowired
    private GeAreaServiceImpl geAreaService;

    /**
     * @author 张东明
     * @info 查询区域信息表
     * @data 2019/2/20
     */
    @GetMapping()
    @PostMapping
    @RequestMapping(value = "/getArea", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public JSONResponse selectAreaAll() {
        JSONResponse resultVo = null;
        List<GeArea> geAreas = geAreaService.selectAll();
        if (geAreas != null) {
            return JSONResponse.OK(Constants.SUCCESS_200, geAreas);
        }
        return JSONResponse.OK(Constants.SUCCESS_204);
    }

    /**
     * @param file
     * @info 文件上传Method
     * @author 张东明
     * @data 2019/2/20
     */
    @RequestMapping(value = "/upLoad", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
    public @ResponseBody
    String addFile(@RequestParam("file") MultipartFile file, Model model, HttpServletRequest request) throws IOException {
        if (file.isEmpty()) {
            return "{\"succeed\":\"上传失败请选择文件\"}";
        }
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID() + suffixName;
        String filePath = "F:/aa/团队项目/项目部分/platform/backstage/platform_back/src/main/resources/static/";
        try {
            file.transferTo(new File(filePath + fileName));
            return "{\"succeed\":\"上传成功\"}";
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return "{\"succeed\":\"上传失败\"}";
    }
}
