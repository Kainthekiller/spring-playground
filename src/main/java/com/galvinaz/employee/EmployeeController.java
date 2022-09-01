package com.galvinaz.employee;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {


//    @GetMapping("/")
//    public String hello()
//    {
//        return "<h1>Hello From Spring</h1>";
//    }

public String test()
{
    return "Test";
}

    @GetMapping("/Employees")
    public List<Employee> getEmployees()
    {
        List<Employee> employees = new ArrayList<>();
        Employee anthony = new Employee("Anthony", 1, 10000000L);
        Employee nick = new Employee("Nick", 1, 100000000000L);
        employees.add(anthony);
        employees.add(nick);
        System.out.println(test());
        return employees;
    }
}
