package spring_intro;

public class Cat implements Pet {
    public Cat() {
        System.out.println(">>>cat constr created<<<");
    }

    @Override
    public void say() {
        System.out.println("Meow-mew");
    }
}
