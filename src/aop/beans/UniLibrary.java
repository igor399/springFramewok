package aop.beans;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    //    @Override
    public void getBook() {
        System.out.println("we getting book from UniLibrary");
        System.out.println("_________________________________________");
    }

    public String returnBook() {
        System.out.println("we return book from UniLibrary");
        return "Billy Bob backers";
    }

    public void getMagazine() {
        System.out.println("we getting mag from UniLibrary");
        System.out.println("_________________________________________");
    }

    public void returnMagazine() {
        System.out.println("we return mag from UniLibrary");
        System.out.println("_________________________________________");
    }

    public void addBook(String personName, Book book) {
        System.out.println("we add book to lib");
        System.out.println("_________________________________________");
    }

    public void addMagazine() {
        System.out.println("we add mag to lib");
        System.out.println("_________________________________________");
    }
}
