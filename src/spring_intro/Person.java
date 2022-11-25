package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("idPerson")
public class Person {
    private Pet pet;
    private String surName;
    private int age;

    public Person() {
        System.out.println(">>>non-arg constr using<<<");
    }


    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
        System.out.println(">>>person constr created<<<");
    }

    public void setPet(Pet pet) {
        System.out.println(">>>setter is using by spring container<<<");
        this.pet = pet;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello Pet");
        pet.say();
    }
}
