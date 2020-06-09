package com.springjdbc.springbootjdbc.dao;

import com.springjdbc.springbootjdbc.model.Employee;
import com.springjdbc.springbootjdbc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao implements EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbctemplate;

    @Override
    public String insertData(Employee employee) {
        String sql = "insert into employee values(?,?,?)";
        jdbctemplate.update(sql, new Object[]
                {employee.getId(),employee.getName(),employee.getCity()});
        return "Data inserted successfully";
    }
}
