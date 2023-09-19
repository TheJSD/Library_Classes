import com.codeclan.Book;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    Book theHobbit;
    @Before
    public void before(){
        theHobbit = new Book("The Hobbit", "J. R. R. Tolkien", "Fantasy");
    }
    @Test
    public void hasTitle(){
        assertEquals("The Hobbit", theHobbit.getTitle());
    }
    @Test
    public void hasAuthor(){
        assertEquals("J. R. R. Tolkien", theHobbit.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("Fantasy", theHobbit.getGenre());
    }
}
