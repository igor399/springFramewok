package aop.bean;


import org.springframework.stereotype.Component;

@Component("libBean")
public class Library {
    public void getBook(){
        System.out.println("we getting book");
    }
}
