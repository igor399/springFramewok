package spring_intro;

import config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Pet cat1 = context.getBean("idCat", Pet.class);
//        Pet cat2 = context.getBean("idCat", Pet.class);
//        System.out.println(cat1 == cat2);

        Person person = context.getBean("idPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
