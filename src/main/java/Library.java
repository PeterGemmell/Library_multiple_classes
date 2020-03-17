import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;
    private int maxStock;

    public Library(int maxStock){
        this.book = new ArrayList<Book>();
        this.maxStock = maxStock;
    }

    public void addBook(Book book){
        maxStock = 6;
        if(this.book.size() < this.maxStock) {
            this.book.add(book);
        }
    }

    public int bookCount(){
        return this.book.size();
    }

     public boolean libraryFull(){
        if(this.book.size() >= this.maxStock){
            return false;
        }else{
            return true;
        }

     }
}
