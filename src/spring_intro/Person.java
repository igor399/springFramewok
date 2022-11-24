package spring_intro;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println(">>>person constr created<<<");
    }

    public void callYourPet(){
        System.out.println("Hello Pet");
        pet.say();
    }
}
