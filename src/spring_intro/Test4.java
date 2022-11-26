package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext1.xml");
        Dog myDog = context.getBean("idPet", Dog.class);
//        myDog.setName("Sobaka");
        myDog.say();
        Dog yourDog = context.getBean("idPet", Dog.class);
        yourDog.say();
//        yourDog.setName("Peos");
//        System.out.println(yourDog + "\n" + myDog);
//        System.out.println(myDog.getName() + "\n" + yourDog.getName());


        context.close();
    }
}
