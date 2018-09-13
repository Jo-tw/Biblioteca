import org.junit.Test;

import static org.junit.Assert.*;

public class BookShelfTest {

    Book b1 = new Book("Patterns of Enterprise Application Architecture");
    Book b2 = new Book("Refactoring Ruby Edition", "Martin Fowler", 2001);
    BookShelf bs = new BookShelf();

    @Test
    public void addBookTest() {
        bs.addBook(b1);
        assertEquals(1, bs.getBooks().size());
    }


}
