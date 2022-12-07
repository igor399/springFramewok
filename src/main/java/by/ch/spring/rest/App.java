package by.ch.spring.rest;

import by.ch.spring.rest.config.Config;
import by.ch.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Communication communication = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.showAllEmployees();
        System.out.println(allEmployees);

        Employee empById = communication.getEmployee(3);
        System.out.println(empById);

        Employee employee = new Employee("Igor", "CH", "IT", 1900);
        employee.setId(13);
        employee.setSurname("Ch");
        employee.setSalary(3900);
        communication.saveEmployee(employee);

        communication.deleteEmployee(2);

    }
}
