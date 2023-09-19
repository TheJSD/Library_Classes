import com.codeclan.Book;
import com.codeclan.Borrower;
import com.codeclan.Library;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BorrowerTest {
    Borrower borrower;
    Library library;
    Book book;
    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(10);
        book = new Book("The Hobbit", "J. R. R. Tolkien", "Fantasy");
    }
    @Test
    public void borrowedBooksStartsEmpty(){
        assertEquals(0, borrower.NumberOfBorrowedBooks());
    }
    @Test
    public void canBorrowBook(){
        library.addBook(book);
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.NumberOfBorrowedBooks());
    }
}
