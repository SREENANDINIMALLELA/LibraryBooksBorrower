import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;
    private ArrayList<Book> rentedBooks;

    public Library(int capacity) {
        this.stock=new ArrayList<Book>();
        this.capacity=capacity;
        this.rentedBooks=new ArrayList<Book>();
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

    public void borrowBook(Book book1 ,Borrower person) {
        if(stock.contains(book1)){
            rentedBooks.add(book1);
            person.addBookToBorrowCollection(book1);
            stock.remove(book1);
        }
    }

    public int getRentedBooksList() {
       return this.rentedBooks.size();
    }
}
