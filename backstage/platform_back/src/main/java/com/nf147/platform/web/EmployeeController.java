package com.nf147.platform.web;

import com.nf147.platform.dao.EmployeeMapper;
import com.nf147.platform.util.response.Constants;
import com.nf147.platform.util.response.JSONResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp")
    public JSONResponse listAll(){
        return JSONResponse.OK(Constants.SUCCESS_200,employeeMapper.selectAll());
    }
}
