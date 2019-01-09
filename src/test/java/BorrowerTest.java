import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Books book;

    @Before
    public void before(){
        borrower = new Borrower("Borna");
        book = new Books("Harry Potter");
    }

    @Test
    public void noBooksCheckedOut(){
        assertEquals(0, borrower.getNumberOfBooks());
    }

    @Test
    public void canAddABookToBorrowerCollection(){
        borrower.addBookToBorrowerCollection(borrower);
        assertEquals(1, borrower.getNumberOfBooks());
    }
}
