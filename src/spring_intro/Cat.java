package spring_intro;

import org.springframework.stereotype.Component;

@Component("idCat")
public class Cat implements Pet {
    public Cat() {
        System.out.println(">>>cat constr created<<<");
    }

    @Override
    public void say() {
        System.out.println("Meow-mew");
    }
}
