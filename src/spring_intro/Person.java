package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("idPerson")
public class Person {
//    @Autowired
//    @Qualifier("idDog")
    private Pet pet;
//    @Value("${person.surname}")
    private String surName;
//    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println(">>>non-arg constr using<<<");
    }

    @Autowired
    public Person(@Qualifier("idDog") Pet pet) {
        this.pet = pet;
        System.out.println(">>>person constr created<<<");
    }

//    @Autowired
//    @Qualifier("idCat")
    public void setPet(Pet pet) {    //you can use autowired annotation not only for setter
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
