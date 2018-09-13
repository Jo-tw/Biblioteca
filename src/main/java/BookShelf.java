import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    List<Book> books = new ArrayList();

     List<Book> getBooks() {
        return books;
    }

    void setBooks(List<Book> books) {
        this.books = books;
    }


     void addBook(Book b1) {
        this.books.add(b1);
    }

    void rmBook(Book b1) {
        this.books.remove(b1);
    }

    void printBooks() {
        for(Book b : books){
            System.out.println(b.getName());
            System.out.println(b.getAuthor());
            System.out.println(b.getYear());

        }
    }

}
