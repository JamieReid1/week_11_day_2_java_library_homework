import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){

        borrower = new Borrower("Jamie");
        library = new Library(5);
        book1 = new Book("Waylander", "David Gemmell", "Fantasy Fiction");
        book2 = new Book("Waylander 2", "David Gemmell", "Fantasy Fiction");

    }


    @Test
    public void canGetName(){
        assertEquals("Jamie", borrower.getName());
    }

    @Test public void canSetName(){
        borrower.setName("Nas");
        assertEquals("Nas", borrower.getName());
    }

    @Test
    public void hasEmptyBookCase(){
        assertEquals(0, borrower.bookCaseCount());
    }

}
