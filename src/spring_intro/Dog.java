package spring_intro;

public class Dog implements Pet {
    public Dog() {
        System.out.println(">>>dog constr created<<<");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
