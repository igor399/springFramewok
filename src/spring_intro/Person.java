package spring_intro;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println(">>>non-arg constr using<<<");
    }

//    public Person(Pet pet) {
//        this.pet = pet;
//        System.out.println(">>>person constr created<<<");
//    }

    public void setPet(Pet pet) {
        System.out.println(">>>setter is using by spring container<<<");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello Pet");
        pet.say();
    }
}
