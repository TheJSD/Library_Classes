import com.codeclan.Library;
import com.codeclan.Book;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class LibraryTest {
    Library library;
    Book book;
    @Before
    public void before(){
        library = new Library(10);
        book = new Book("The Hobbit", "J. R. R. Tolkien", "Fantasy");
    }
    @Test
    public void collectionStartsEmpty(){
        assertEquals (0, library.countBooks());
    }
    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1,library.countBooks());
    }
    @Test
    public void cannotGoBeyondCapacity(){
        for(int i=0; i<12; i++ ) {
            library.addBook(book);
        }
        assertEquals(10, library.countBooks());
    }
}
