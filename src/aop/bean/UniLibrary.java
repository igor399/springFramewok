package aop.bean;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("we getting book from UniLibrary");
    }

    public void getMagazine(){
        System.out.println("we getting mag from UniLibrary");
    }

    public String returnMagazine(){
        System.out.println("we return mag from UniLibrary");
        return "Ok";
    }
}
