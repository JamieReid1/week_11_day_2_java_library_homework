import org.junit.Before;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2

    @Before
    public void before(){

        borrower = new Borrower();
        library = new Library(5);
        book1 = new Book("Waylander", "David Gemmell", "Fantasy Fiction");
        book2 = new Book("Waylander 2", "David Gemmell", "Fantasy Fiction");

    }

}
