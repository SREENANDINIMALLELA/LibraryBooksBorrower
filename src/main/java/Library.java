import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;
    private ArrayList<Book> rentedBooks;
    private HashMap<String ,Integer>booksByGenre;

    public Library(int capacity) {
        this.stock=new ArrayList<Book>();
        this.capacity=capacity;
        this.rentedBooks=new ArrayList<Book>();
        this.booksByGenre=new HashMap<String, Integer>();
    }

    public int getNoOfBooksStock() {
        return this.stock.size();
    }
    public void addBook(Book book){

        if(this.capacity!= 0){
            stock.add(book);
            this.capacity-=1;
            String genre= book.getGenre();
            if (booksByGenre.containsKey(genre)){
                int x = booksByGenre.get(genre);
                booksByGenre.put(genre,x+1);
            }else
            {
                booksByGenre.put(genre,1);
            }

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

    public int getBookInGenre(String genreName) {
       return booksByGenre.get(genreName);
    }
}
