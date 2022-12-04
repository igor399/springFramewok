package by.ch.mvc.beans;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String bikeBrand;
    private Map<String, String> bikeBrands;


    public Employee() {
        departments = new HashMap<>();
        departments.put("Cyber Slavyane", "CS");
        departments.put("Noob Programmers", "NP");
        departments.put("Horny HR's", "HHR");

        bikeBrands = new HashMap<>();
        bikeBrands.put("Trek", "TR");
        bikeBrands.put("Canondale", "Cd");
        bikeBrands.put("Cube", "Cb");
    }

    public String getBikeBrand() {
        return bikeBrand;
    }

    public void setBikeBrand(String bikeBrand) {
        this.bikeBrand = bikeBrand;
    }

    public Map<String, String> getBikeBrands() {
        return bikeBrands;
    }

    public void setBikeBrands(Map<String, String> bikeBrands) {
        this.bikeBrands = bikeBrands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", departments=" + departments +
                '}';
    }
}
