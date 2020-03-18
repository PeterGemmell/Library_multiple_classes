import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("Treasure Island", "Adventure", "Robert Louis Stevenson");
        book = new Book("Can't Hurt Me", "David Goggins", "Biography");

    }


    @Test
    public void addNewBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void maxStock(){
      assertEquals(true, library.libraryFull());
    }




}
