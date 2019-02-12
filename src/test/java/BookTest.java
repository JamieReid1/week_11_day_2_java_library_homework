import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {

    Book book;

    @Before
    public void before(){

        book = new Book("Waylander", "David Gemmell", "Fantasy Fiction");

    }


    @Test
    public void canGetTitle(){
        assertEquals("Waylander", book.getTitle());
    }

    @Test
    public void canSetTitle(){
        book.setTitle("Waylander 2");
        assertEquals("Waylander 2", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("David Gemmell", book.getAuthor());
    }

    @Test
    public void canSetAuthor(){
        book.setTitle("The Ill Made Knight");
        book.setAuthor("Christian Cameron");
        assertEquals("Christian Cameron", book.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Fantasy Fiction",  book.getGenre());
    }

}
