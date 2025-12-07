import java.util.*;
import org.tech.Book;

public class BookApp{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		
		Book[]b=new Book[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter id name author");
			int ii=sc.nextInt();
			String n=sc.next();
			String a=sc.next();
			
			b[i]=new Book(ii,n,a);
			v.add(b[i]);
		}
		Iterator i=v.iterator();
		while(i.hasNext()){
			Object obj=i.next();
			Book bo=(Book)obj;
			System.out.println("Enter a search id");
			int idd=sc.nextInt();
			if(idd==bo.getId())
				System.out.println(bo.getId()+"\t"+bo.getName()+"\t"+bo.getAuthor());
			else 
				System.out.println("ID Not Found");
		}
		
		
		
		
	
	
	}

}