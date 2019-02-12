import org.junit.Before;

import java.util.ArrayList;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    ArrayList<Book> bookCollection;

    @Before
    public void before(){

        library = new Library();
        bookCollection = new ArrayList<>();

        book1 = new Book("Waylander", "David Gemmell", "Fantasy Fiction");
        book2 = new Book("Waylander 2", "David Gemmell", "Fantasy Fiction");
        book3 = new Book("The Ill Made Knight", "Christian Cameron", "Medieval Fiction");
        bookCollection.add(book1);
        bookCollection.add(book2);
        bookCollection.add(book3);

    }




}
