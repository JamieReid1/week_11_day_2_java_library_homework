import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> bookCase;

    public Borrower(String name){

        this.name = name;
        this.bookCase = new ArrayList<>();

    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int bookCaseCount(){
        return this.bookCase.size();
    }

}
