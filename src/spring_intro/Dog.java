package spring_intro;

public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println(">>>dog constr created<<<");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
