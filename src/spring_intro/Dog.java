package spring_intro;

public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println(">>>dog constr created<<<");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    public void init(){
        System.out.println("init method");
    }

    public void destroy(){
        System.out.println("destroy method");
    }
}
