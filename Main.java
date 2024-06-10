import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static BookManager bookManager = new BookManager();
  
  public static void main(String[] args) {

    while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 to ADD a new book to the library");
        System.out.println("Type 2 to SEE all books in the library");
        System.out.println("Type 3 to REMOVE a book from the library");
        System.out.println("Type ANY symbol to exit");
        String input = scanner.nextLine();
        if(input.equals("1")){
          createBook();
        } else if (input.equals("2")){
          showLibrary();
        } else if (input.equals("3")){
          System.out.println("Type the name of the book that you would like to remove");
          String bookTitle = scanner.nextLine();
          bookManager.removeBook(bookTitle);
        } else {
          break;
        }
      }
    }
  
  public static void createBook(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter book title: ");
    String title = scanner.nextLine();
    System.out.println("Enter book author: ");
    String author = scanner.nextLine();
    System.out.println("Enter book pages: ");
    int pages = scanner.nextInt();
    Book book = new Book(title, author, pages);
    bookManager.addBook(book);
  }

  public static void showLibrary(){
    var library = bookManager.getBooks();
      for(var book : library){
        System.out.println("    ***");
        System.out.println("Title: "+ book.getTitle()); 
        System.out.println("Author: " + book.getAuthor()); 
        System.out.println("Pages: " + book.getPages() + "\n"); 
    }
  }
}
