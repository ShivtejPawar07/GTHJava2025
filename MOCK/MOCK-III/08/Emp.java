import tech.org.EmpInfo;
import tech.org.Employee;
import java.util.*;
public class Emp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		Employee[] e=new Employee[2];
		
		for(int i=0;i<e.length;i++){
			
			System.out.println("Enter id name salary");
			int id=sc.nextInt();
			String name=sc.next();
			double sal=sc.nextDouble();
			
			e[i] = new Employee();
            e[i].setId(id);
            e[i].setName(name);
            e[i].setSalary(sal);
			
		}
		EmpInfo em=new EmpInfo();
		em.accept(e);
		em.calculateBonus();
		em.displayEmployeeDetails();
	}
}