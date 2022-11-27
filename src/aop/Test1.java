package aop;

import aop.bean.SchoolLibrary;
import aop.bean.UniLibrary;
import aop.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();
        uniLibrary.getBook();
        uniLibrary.getMagazine();
        uniLibrary.returnMagazine();
        context.close();
    }
}
