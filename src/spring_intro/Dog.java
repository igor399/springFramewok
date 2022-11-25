package spring_intro;

import org.springframework.stereotype.Component;

@Component("idDog")
public class Dog implements Pet {
    public Dog() {
        System.out.println(">>>dog constr created<<<");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
