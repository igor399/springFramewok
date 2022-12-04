package by.ch.mvc.controllers;

import by.ch.mvc.beans.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/emp")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details";
    }

//    @RequestMapping("/showDetails")
//    public String showShowDetails() {
//        return "show-details";
//    }

//    @RequestMapping("/showDetails")
//    public String showShowDetails(HttpServletRequest request, Model model) {
//        model.addAttribute("attribute", "Mr. " + request.getParameter("employeeName"));
//        model.addAttribute("description", "<-- sobaka");
//        return "show-details";
//    }

    @RequestMapping("/showDetails")
    public String showShowDetails(@Valid @ModelAttribute("employee") Employee employee,
                                  BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-details";
        } else {
            return "show-details";
        }
    }
}
