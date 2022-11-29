package aop.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Igor Ch", 5, 9.3);
        Student student2 = new Student("Igor Che", 3, 8.5);
        Student student3 = new Student("Igor Chb", 1, 7.1);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println(students);
        return students;
    }


}
