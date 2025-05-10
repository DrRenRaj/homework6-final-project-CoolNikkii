package hw6;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    //if isbn exists
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("Book with this ISBN already exists.");
                return;
            }
        }
        books.add(book);
        System.out.println("Book added successfully.");
    }
    
    //if book removed
    public void removeBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    //if no books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }
    
    //searching by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("No books found with that title.");
    }
    
    //searching by author
    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book b : books) {
            if (b.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("No books found by that author.");
    }

    //for checking out the books
    public void checkOutBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                if (!b.isAvailable()) {
                    System.out.println("Book is already checked out.");
                    return;
                }
                b.setAvailable(false);
                System.out.println("Book checked out.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
    
    //for returning books
    public void returnBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                if (b.isAvailable()) {
                    System.out.println("Book is already available.");
                    return;
                }
                b.setAvailable(true);
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
