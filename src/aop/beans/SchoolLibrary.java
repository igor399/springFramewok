package aop.beans;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

//    @Override
    public void getBook() {
        System.out.println("we getting book from SchoolLibrary");
    }
}
