/* **10. Student Marks Entry**

**Description:**

* Keep asking for student marks in a do-while loop.
* If marks are negative, **continue** to skip and ask again.
* If "stop" is entered, **break**.
* Finally, display average marks of valid entries.*/
import java.util.*;
class Student{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter Math Marks");
			int s1=sc.nextInt();
			if(s1<0){
				System.out.println("Invalid marks");
				continue;
			}
			System.out.println("Enter sci Marks");
			int s2=sc.nextInt();
			if(s2<0){
				System.out.println("Invalid marks");
				continue;
			}
			System.out.println("Enter com Marks");
			int s3=sc.nextInt();
			if(s3<0){
				System.out.println("Invalid marks");
				continue;
			}
			System.out.println("Enter marathi Marks");
			int s4=sc.nextInt();
			if(s4<0){
				System.out.println("Invalid marks");
				continue;
			}System.out.println("Enter hindi Marks");
			int s5=sc.nextInt();
			if(s5<0){
				System.out.println("Invalid marks");
				continue;
			}
			
			
			
		}while(true);
		
	}
}