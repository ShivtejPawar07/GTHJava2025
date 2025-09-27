package com.tot;
import java.util.*;
public class Book {
	Scanner sc = new Scanner(System.in);
	Library[] l;
	public void accept(Library...l) {
		this.l=l;
	}
	public void addBook() {
	    

	    for (int i = 0; i < l.length; i++) {
	        System.out.print("Enter Accession Number: ");
	        int accNo = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter Title: ");
	        String title = sc.nextLine();

	        System.out.print("Enter Author: ");
	        String author = sc.nextLine();

	        System.out.print("Enter Price: ");
	        double price = sc.nextDouble();
	        sc.nextLine(); // consume newline

	        l[i] = new Library(accNo, title, author, price);
	    }
	}


	public void displayAllBooks() {
	    for (int i = 0; i < l.length; i++) {
	        if (l[i] != null) {
	            System.out.println("Accession Number: " + l[i].getAccNo());
	            System.out.println("Title: " + l[i].getTitle());
	            System.out.println("Author: " + l[i].getAuthor());
	            System.out.println("Price: " + l[i].getPrice());
	            System.out.println("--------------------------");
	        }
	    }
	}


	public void displayBooksByAuthor() {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter an Author name:");
	    String name = sc.nextLine();

	    for (int i = 0; i < l.length; i++) {
	        if (l[i] != null && l[i].getAuthor().equalsIgnoreCase(name)) {
	            System.out.println("Accession Number: " + l[i].getAccNo());
	            System.out.println("Title: " + l[i].getTitle());
	            System.out.println("Author: " + l[i].getAuthor());
	            System.out.println("Price: " + l[i].getPrice());
	            System.out.println("--------------------------");
	        }
	    }
	}


	public void displayBookByTitle() {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the Title of the book:");
	    String title = sc.nextLine();

	    for (int i = 0; i < l.length; i++) {
	        if (l[i] != null && l[i].getTitle().equalsIgnoreCase(title)) {
	            System.out.println("Accession Number: " + l[i].getAccNo());
	            System.out.println("Title: " + l[i].getTitle());
	            System.out.println("Author: " + l[i].getAuthor());
	            System.out.println("Price: " + l[i].getPrice());
	            System.out.println("--------------------------");
	        }
	    }
	}


	public void displayBookCount() {
	    int count = 0;
	    for (int i = 0; i < l.length; i++) {
	        if (l[i] != null) {
	            count++;
	        }
	    }
	    System.out.println("Total number of books in the library: " + count);
	}


	public void displayBooksAscending() {
	    for (int i = 0; i < l.length - 1; i++) {
	        for (int j = i + 1; j < l.length; j++) {
	            if (l[i] != null && l[j] != null && l[i].getAccNo() > l[j].getAccNo()) {
	                Library temp = l[i];
	                l[i] = l[j];
	                l[j] = temp;
	            }
	        }
	    }

	    System.out.println("Books in ascending order of Accession Number:");
	    for (int i = 0; i < l.length; i++) {
	        if (l[i] != null) {
	            System.out.println("Accession Number: " + l[i].getAccNo());
	            System.out.println("Title: " + l[i].getTitle());
	            System.out.println("Author: " + l[i].getAuthor());
	            System.out.println("Price: " + l[i].getPrice());
	            System.out.println("--------------------------");
	        }
	    }
	}

	public void updateBookByTitle() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the title of the book to update:");
	    String title = sc.nextLine();

	    for (int i = 0; i < l.length; i++) {
	        if (l[i] != null && l[i].getTitle().equalsIgnoreCase(title)) {
	            System.out.print("Enter new Accession Number: ");
	            int accNo = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter new Title: ");
	            String newTitle = sc.nextLine();

	            System.out.print("Enter new Author: ");
	            String author = sc.nextLine();

	            System.out.print("Enter new Price: ");
	            double price = sc.nextDouble();
	            sc.nextLine();

	            l[i] = new Library(accNo, newTitle, author, price);
	            System.out.println("Book details updated successfully!");
	            break;
	        }
	    }
	}

	public void deleteBookByPrice() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the price of the book(s) to delete:");
	    double price = sc.nextDouble();

	    for (int i = 0; i < l.length; i++) {
	        if (l[i] != null && l[i].getPrice() == price) {
	            l[i] = null;
	            System.out.println("Book deleted successfully at index " + i);
	        }
	    }
	}

	public void displayPriceRange() {
	    System.out.println("Books with price between 100 and 500:");
	    for (int i = 0; i < l.length; i++) {
	        if (l[i] != null && l[i].getPrice() >= 100 && l[i].getPrice() <= 500) {
	            System.out.println("Accession Number: " + l[i].getAccNo());
	            System.out.println("Title: " + l[i].getTitle());
	            System.out.println("Author: " + l[i].getAuthor());
	            System.out.println("Price: " + l[i].getPrice());
	            System.out.println("--------------------------");
	        }
	    }
	}


}
