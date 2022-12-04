package by.ch.mvc.beans;


import by.ch.mvc.validations.CheckEmail;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @NotBlank(message = "req field!")
    @Size(min = 2, max = 15, message = "name must be min 2 characters")
    private String name;


    @NotBlank(message = "req field!")
    @Size(min = 1, max = 33, message = "surname must be min 2 characters")
    private String surname;


    @Min(value = 100, message = "salary min 100$")
    @Max(value = 10000, message = "salary max 10_000$")
    private int salary;

    private String department;

    private Map<String, String> departments;

    private String bikeBrand;

    private Map<String, String> bikeBrands;

    private String[] languages;

    private Map<String, String> langs;


    @CheckEmail(value = "gmail.com", message = "email must ends gmail.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Cyber Slavyane", "CS");
        departments.put("Noob Programmers", "NP");
        departments.put("Horny HR's", "HHR");

        bikeBrands = new HashMap<>();
        bikeBrands.put("Trek", "TR");
        bikeBrands.put("Canondale", "Cd");
        bikeBrands.put("Cube", "Cb");

        langs = new HashMap<>();
        langs.put("Belaruisian", "BEL");
        langs.put("English", "EN");
        langs.put("Deutch", "DE");
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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLangs() {
        return langs;
    }

    public void setLangs(Map<String, String> langs) {
        this.langs = langs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", departments=" + departments +
                ", bikeBrand='" + bikeBrand + '\'' +
                ", bikeBrands=" + bikeBrands +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
