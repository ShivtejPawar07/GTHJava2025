import org.tech.BonusCalculator;
import org.tech.Employee;
import java.util.*;
public class EmployeeApp{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		Employee[]e=new Employee[2];
		
		e[0]=new Employee(1,"S",10000,5);
		e[1]=new Employee(2,"Ss",100000,3);
		
		BonusCalculator bs=new BonusCalculator();
		bs.setEmployee(e);
		bs.display();
	}
}
