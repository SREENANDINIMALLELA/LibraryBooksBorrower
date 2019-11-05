import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
    private Library library ;
    private Book book1;
    private Book book2;
    private Book book3;
    private Borrower person;


    @Before
    public void before() {
        book1 = new Book("InTo Thin Air","Jon Krakauer","Adventure");
        book2 = new Book("InTo ","Jon","Romatic");
        book3 = new Book("rangas","Jon Kr","comedy");

        library = new Library(3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        person=new Borrower();
    }


    @Test
    public void addBookToStockTest(){
        assertEquals(3,library.getNoOfBooksStock());
    }
    @Test
    public void checkCapacityBeforAddStock(){
        library.addBook(book1);
        assertEquals(3,library.getNoOfBooksStock());
    }
    @Test
    public void canBarrowBookTest() {
        library.borrowBook(book1,person);
        assertEquals(2,library.getNoOfBooksStock());
    }
    @Test
    public void canCheckBorrowedBookTest() {
        library.borrowBook(book1,person);
        assertEquals(1,library.getRentedBooksList());
    }

}
