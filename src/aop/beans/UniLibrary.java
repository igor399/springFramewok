package aop.beans;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

//    @Override
    public void getBook(Book book) {
        System.out.println("we getting book from UniLibrary -> " + book.getName());
    }

    public void getMagazine() {
        System.out.println("we getting mag from UniLibrary");
    }

    public String returnMagazine() {
        System.out.println("we return mag from UniLibrary");
        return "Ok";
    }
}
