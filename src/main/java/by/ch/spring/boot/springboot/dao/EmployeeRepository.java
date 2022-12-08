package by.ch.spring.boot.springboot.dao;

import by.ch.spring.boot.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee>findEmployeesByDepartment(String dep);
}
