package by.ch.spring.rest.controller;

import by.ch.spring.rest.entity.Employee;
import by.ch.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getEmployees();
        return allEmployees;
    }


}
