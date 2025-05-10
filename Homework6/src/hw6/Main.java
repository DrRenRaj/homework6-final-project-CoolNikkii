package hw6;
//Commit
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        // for goodbye case stopping the program
        boolean running = true;

        while(running) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Search by Title");
            System.out.println("5. Search by Author");
            System.out.println("6. Check Out Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.println("\nEnter your choice: ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
            	
            	//case for adding the book
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
                    
                //case for removing the book
                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    library.removeBook(scanner.nextLine());
                    break;
                    
                //case for displaying
                case 3:
                    library.displayAllBooks();
                    break;
                    
                case 4:
                    System.out.print("Enter title to search: ");
                    library.searchByTitle(scanner.nextLine());
                    break;
                    
                case 5:
                    System.out.print("Enter author to search: ");
                    library.searchByAuthor(scanner.nextLine());
                    break;
                    
                case 6:
                    System.out.print("Enter ISBN to check out: ");
                    library.checkOutBook(scanner.nextLine());
                    break;
                    
                case 7:
                    System.out.print("Enter ISBN to return: ");
                    library.returnBook(scanner.nextLine());
                    break;
                    
                case 8:
                    System.out.println("\nGoodbye!");
                    scanner.close();
                    running = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please select between 1 and 8.");
            }
        }
    }
}
