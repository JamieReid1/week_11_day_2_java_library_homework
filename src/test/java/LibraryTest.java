import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    ArrayList<Book> books;

    @Before
    public void before(){

        library = new Library(1);
        books = new ArrayList<>();

        book1 = new Book("Waylander", "David Gemmell", "Fantasy Fiction");
        book2 = new Book("Waylander 2", "David Gemmell", "Fantasy Fiction");
        book3 = new Book("The Ill Made Knight", "Christian Cameron", "Medieval Fiction");
        books.add(book1);
        books.add(book2);
        books.add(book3);

    }


    @Test
    public void hasABookCollectionStartsEmpty(){
        assertEquals(0, library.bookCollectionCount());
    }

    @Test
    public void canAddBookToBookCollection(){
        library.addBook(book1);
        assertEquals(1, library.bookCollectionCount());
    }

    @Test
    public void canGetBookCapacity(){
        assertEquals(1, library.getBookCapacity());
    }

    @Test
    public void canSetBookCapacity(){
        library.setBookCapacity(2);
        assertEquals(2, library.getBookCapacity());
    }

    @Test
    public void canCheckStockAtCapacity(){
        library.setBookCapacity(2);
        assertEquals(2, library.getBookCapacity());
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCollectionCount());
        assertEquals(true, library.stockAtCapacity());
    }

    @Test
    public void canOnlyAddBookIfNotAtCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1, library.bookCollectionCount());
    }

}
