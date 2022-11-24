package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//      Pet pet = new Dog();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

//      Pet pet = context.getBean("catPet", Pet.class);

        Person person = context.getBean("idPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
