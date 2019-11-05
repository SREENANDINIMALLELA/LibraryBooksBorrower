import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
    private Library library ;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private ArrayList<Book> stock ;


    @Before
    public void before() {
        book1 = new Book("InTo Thin Air","Jon Krakauer","Adventure");
        stock= new ArrayList<Book>();
        library = new Library(stock,1);
    }


    @Test
    public void addBookToStockTest(){
        library.addBook(book1);
        assertEquals(1,library.getNoOfBooksStock());
    }
    @Test
    public void checkCapacityBeforAddStock(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1,library.getNoOfBooksStock());

    }





}
