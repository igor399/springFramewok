package aop;

import aop.beans.Book;
import aop.beans.SchoolLibrary;
import aop.beans.UniLibrary;
import aop.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        Book book = context.getBean("book", Book.class);
//        schoolLibrary.getBook();
        uniLibrary.getBook(book);
//        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
        context.close();
    }
}
