import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {

    Book book;

    @Before
    public void before(){

        book = new Book("Waylander");

    }


    @Test
    public void canGetTitle(){
        assertEquals("Waylander", book.getTitle());
    }

}
