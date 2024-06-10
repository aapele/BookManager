import java.util.ArrayList;

public class BookManager {
  private ArrayList<Book> books = new ArrayList<Book>();

  public void addBook(Book book){
    books.add(book);
  }

  public ArrayList<Book> getBooks(){
    return books;
  }

  public void removeBook(String bookTitle) {
      books.removeIf(book -> book.getTitle().equals(bookTitle));
  }
}
