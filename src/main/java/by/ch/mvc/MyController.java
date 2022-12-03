package by.ch.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails() {
        return "ask-emp-details";
    }

//    @RequestMapping("/showDetails")
//    public String showShowDetails() {
//        return "show-details";
//    }

    @RequestMapping("/showDetails")
    public String showShowDetails(HttpServletRequest request, Model model) {
        model.addAttribute("attribute", "Mr. " + request.getParameter("employeeName"));
        model.addAttribute("description", "<-- sobaka");
        return "show-details";
    }
}
