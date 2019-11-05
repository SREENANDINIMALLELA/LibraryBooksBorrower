import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowersCollection;
    public Borrower(){
        this.borrowersCollection=new ArrayList<Book>();
    }

    public int getCollection(){
        return this.borrowersCollection.size();
    }

    public void addBookToBorrowCollection(Book book) {
        this.borrowersCollection.add(book);
    }
}
