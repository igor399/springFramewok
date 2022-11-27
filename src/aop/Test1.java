package aop;

import aop.bean.Library;
import aop.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("libBean", Library.class);
        library.getBook();
        context.close();
    }
}
