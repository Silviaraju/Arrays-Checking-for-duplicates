package com.springjdbc.springbootjdbc.Controller;

import com.springjdbc.springbootjdbc.dao.EmployeeDao;
import com.springjdbc.springbootjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @PostMapping(value="/save1")
    public String saveEmployee(@RequestBody Employee employee){
        return employeeDao.insertData(employee);
    }
}
