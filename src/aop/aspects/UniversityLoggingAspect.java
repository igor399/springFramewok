package aop.aspects;

import aop.beans.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("   > logging of getting students list");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        firstStudent.setSurName("MR. " + firstStudent.getSurName());
//        double avgGrade = firstStudent.getAvgGrade() + 100;
//        firstStudent.setAvgGrade(avgGrade);
//        System.out.println("   > logging of getting students list after working getStudents method");
//    }


//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("logging of throwing exception " + exception);
//    }

    @After("execution  (* getStudents())")
    public void afterStudentsLoggingAdvice() {
        System.out.println("logging of normal method working or throwing exception ");
    }
}
