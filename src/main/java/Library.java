import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(ArrayList<Book> stock ,int capacity) {
        this.stock=stock;
        this.capacity=capacity;
    }

    public int getNoOfBooksStock() {
        return this.stock.size();
    }
    public void addBook(Book book){
        if(this.capacity!= 0){
            stock.add(book);
            this.capacity-=1;
        }
    }
}
