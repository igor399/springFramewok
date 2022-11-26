package spring_intro;

import config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person person = context.getBean("idPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
