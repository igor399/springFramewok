package aop.beans;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    //    @Override
    public void getBook() {
        System.out.println("we getting book from UniLibrary ->");
    }

    public void returnBook() {
        System.out.println("we return book from UniLibrary");
    }

    public void getMagazine() {
        System.out.println("we getting mag from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("we return mag from UniLibrary");
    }

    public void addBook() {
        System.out.println("we add book to lib");
    }

    public void addMagazine() {
        System.out.println("we add mag to lib");
    }

}
