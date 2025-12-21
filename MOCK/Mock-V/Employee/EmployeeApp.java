import org.tech.Employee;
import org.tech.EmployeeOpr;
import java.util.*;

public class EmployeeApp{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		Employee[] e=new Employee[2];
		EmployeeOpr eo=new EmployeeOpr();
		eo.accept(e);
		int ch;
		do{
			System.out.println("1.add");
			System.out.println("2.display");
			System.out.println("3.search");
			System.out.println("4.update");
			System.out.println("5.delete");
			System.out.println("6.Exit");
			System.out.println(".Enter your choice");
			ch=sc.nextInt();
			
			switch(ch){
				case 1:eo.add();
				break;
				case 2:eo.display();
				break;
				case 3:eo.search();
				break;
				case 4:eo.update();
				break;
				case 5:eo.delete();
				break;
				case 6:System.out.println(".Exit");
				break;
				default:System.out.println(".Invalid choice");
				
			}
			
			
		}while(ch!=6);
	}
}