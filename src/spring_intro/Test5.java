package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext2.xml");
        Cat myCat = context.getBean("idCat", Cat.class);
        myCat.say();
        context.close();
    }
}
