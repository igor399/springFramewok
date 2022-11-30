package aop;

import aop.beans.Student;
import aop.beans.UniLibrary;
import aop.beans.University;
import aop.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method Main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("return book to the lib " + bookName);
        System.out.println("Method Main ends");
        context.close();
    }
}

