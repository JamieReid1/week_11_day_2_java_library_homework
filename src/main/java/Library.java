import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int bookCapacity;

    public Library(int bookCapacity){

        this.bookCollection = new ArrayList<>();
        this.bookCapacity = bookCapacity;

    }


    public int bookCollectionCount(){
        return this.bookCollection.size();
    }

    public void addBook(Book book){
        this.bookCollection.add(book);
    }

    public int getBookCapacity(){
        return this.bookCapacity;
    }

    public void setBookCapacity(int capacity){
        this.bookCapacity = capacity;
    }

}
