import org.junit.Test;


import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BookShelfTest {

    Book b1 = new Book("Patterns of Enterprise Application Architecture");
    Book b2 = new Book("Refactoring Ruby Edition", "Martin Fowler", 2001);
    BookShelf bs = new BookShelf();

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;




    @Test
    public void addBookTest() {
        bs.addBook(b1);
        assertEquals(1, bs.getBooks().size());
    }

    public void removeBookTest() {
        bs.rmBook(b1);
        assertEquals(0, bs.getBooks().size());
    }


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }


    @Test
    public void printBooks() {
        bs.addBook(b2);
        bs.printBooks();
        assertEquals("Refactoring Ruby Edition\nMartin Fowler\n2001\n", outContent.toString());


    }
}