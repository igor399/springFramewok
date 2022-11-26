package spring_intro;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("idDog")
@Scope
public class Dog implements Pet {
    public Dog() {
        System.out.println(">>>dog constr created<<<");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("destroy method");
//    }
}
