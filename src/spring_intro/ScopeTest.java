package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext2.xml");
        Dog myDog = context.getBean("idDog", Dog.class);
        myDog.say();
        context.close();
    }
}
