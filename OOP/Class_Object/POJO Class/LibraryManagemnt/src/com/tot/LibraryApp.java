package com.tot;
import java.util.*;
public class LibraryApp {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		Library[] l=new Library[3];
		Book b=new Book();
		b.accept(l);
		int ch;
		do {
		    // Print menu
		    System.out.println("1. Add Book Details.");
		    System.out.println("2. Display All Book Details.");
		    System.out.println("3. Display List of all books of given author.");
		    System.out.println("4. Display list the title of specified book.");
		    System.out.println("5. Display list count of the book in the library.");
		    System.out.println("6. Display list the books in the ascending order of accession number.");
		    System.out.println("7. Update book details by title of book.");
		    System.out.println("8. Delete book details by price.");
		    System.out.println("9. Display the price range between 100 to 500.");
		    System.out.println("10. Exit The Code.");
		    System.out.print("Enter your choice: ");
		    ch = sc.nextInt();
		    sc.nextLine(); // consume newline

		    switch (ch) {
		    case 1:
		        b.addBook();
		        break;
		    case 2:
		        b.displayAllBooks();
		        break;
		    case 3:
		        b.displayBooksByAuthor();
		        break;
		    case 4:
		        b.displayBookByTitle();
		        break;
		    case 5:
		        b.displayBookCount();
		        break;
		    case 6:
		        b.displayBooksAscending();
		        break;
		    case 7:
		        b.updateBookByTitle();
		        break;
		    case 8:
		        b.deleteBookByPrice();
		        break;
		    case 9:
		        b.displayPriceRange();
		        break;
		    case 10:
		        System.out.println("Exiting the program...");
		        break;
		    default:
		        System.out.println("Invalid choice! Please try again.");
		}


		    System.out.println(); // blank line for readability

		} while (ch != 10);

		
	}
}
