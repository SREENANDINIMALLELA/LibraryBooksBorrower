import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {
    Borrower person;
    Book book1;
    Library library;
    @Before
    public void before(){
        book1 = new Book("InTo Thin Air","Jon Krakauer","Adventure");
        person=new Borrower();
        library=new Library(4);
        library.addBook(book1);
    }
    @Test
    public void CanBarrowTest(){
       library.borrowBook(book1,person);
        assertEquals(1,person.getCollection());
    }

}
