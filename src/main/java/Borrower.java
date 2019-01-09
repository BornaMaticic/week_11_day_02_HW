import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Borrower> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getNumberOfBooks(){
      return this.borrowedBooks.size();
    }


    public void addBookToBorrowerCollection(Borrower borrower) {
        this.borrowedBooks.add(borrower);
    }
}

