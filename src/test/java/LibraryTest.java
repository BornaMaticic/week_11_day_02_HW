import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Books book;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library("Shop till you drop");
        book = new Books("Harry Potter");
        borrower = new Borrower("Aiste");
    }

    @Test
    public void numberOfBooksInLibrary(){
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void checkLibrarySpaceAvailable(){
        library.addABookIfSpace(book);
        assertEquals(true, library.CheckIfSpaceAvailableInLibrary());
    }

    @Test
    public void checkLibrarySpaceNotAvailable(){
        Books book1 = new Books("Harry Potter 1");
        Books book2 = new Books("Harry Potter 2");
        Books book3 = new Books("Harry Potter 3");
        Books book4 = new Books("Harry Potter 4");
        library.addABookIfSpace(book);
        assertEquals(true, library.CheckIfSpaceAvailableInLibrary());
    }

    @Test
    public void addBooksToLibraryIfSpaceAvailable(){
        library.addABookIfSpace(book);
        assertEquals(1, library.getNumberOfBooks());
    }
}
