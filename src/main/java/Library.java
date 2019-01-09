import java.util.ArrayList;

public class Library {

    private ArrayList<Books> collectionOfBooks;
    private int capacity = 3;
    private String name;

    public Library(String name){
        this.name = name;
        this.collectionOfBooks = new ArrayList<>();
    }

    public int getNumberOfBooks(){
        return this.collectionOfBooks.size();
    }

    public boolean CheckIfSpaceAvailableInLibrary(){
        if (this.getNumberOfBooks() <= capacity)
            return true;
        else {
            return false;
        }
    }

    public void addABookIfSpace(Books book) {
        if (this.getNumberOfBooks() < capacity)
        this.collectionOfBooks.add(book);
    }
}
