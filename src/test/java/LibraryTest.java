import org.junit.Before;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){

        library = new Library();

        book1 = new Book("Waylander", "David Gemmell", "Fantasy Fiction");
        book2 = new Book("Waylander 2", "David Gemmell", "Fantasy Fiction");
        book3 = new Book("The Ill Made Knight", "Christian Cameron", "Medieval Fiction");

    }




}
