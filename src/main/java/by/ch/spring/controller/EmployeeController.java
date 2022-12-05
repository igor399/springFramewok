package by.ch.spring.controller;

import by.ch.spring.dao.EmployeeDAO;
import by.ch.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeDAO.getEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }
}
