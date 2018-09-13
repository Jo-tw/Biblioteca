import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    List<Book> books = new ArrayList();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    public void addBook(Book b1) {
        this.books.add(b1);
    }

}
