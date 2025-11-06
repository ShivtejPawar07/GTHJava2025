/*Q5. Problem:
 Create a class Book with fields:
bookId, title, author, and price.
Use:
A default constructor to print “Book object created”.
A parameterized constructor with bookId and title.
Another parameterized constructor with bookId, title, author, and price
 that calls the previous constructor using this() (constructor chaining).
Add a method display() to show book details.
Hint:
 Use this(bookId, title) inside the main constructor to reuse initialization logic.
Explanation:
 This question checks understanding of constructor chaining, which helps avoid code duplication inside multiple constructors.
*/
import java.util.*;
class Book{
	int id;
	String title;
	String author;
	int price;
	Book(){
		System.out.println("Parameterized Constructor");
	}
	Book(int id,String title){
		this.id=id;
		this.title=title;
	}
	Book(int id,String title,String author,int price){
		this(id,title);
		this.author=author;
		this.price=price;
	}
	void display(){
		System.out.println("Id="+id);
		System.out.println("Title="+title);
		System.out.println("Author="+author);
		System.out.println("Price="+price);
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a id title author price");
		
		int i=sc.nextInt();
		String t=sc.next();
		String a=sc.next();
		int p=sc.nextInt();
		
		Book b=new Book();
		Book b2=new Book(i,t);
		b2.display();
		Book b1=new Book(i,t,a,p);
		b1.display();
	}
}