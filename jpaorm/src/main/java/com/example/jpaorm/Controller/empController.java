package com.example.jpaorm.Controller;

import com.example.jpaorm.Model.Employee;
import com.example.jpaorm.Repository.empRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class empController {

    @Autowired
    private empRepository empRepository;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody List<Employee> employee){
    empRepository.saveAll(employee);
    return "employee saved";
    }
}
