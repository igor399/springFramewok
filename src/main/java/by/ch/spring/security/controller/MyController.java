package by.ch.spring.security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {


    @GetMapping("/")
    public String showAllEmployees() {
        return "allEmployees";
    }

    @GetMapping("/hr_info")
    public String getInfoHR() {
        return "for-hr";
    }

    @GetMapping("/manager_info")
    public String getInfoManagers() {
        return "for-manager";
    }

}
