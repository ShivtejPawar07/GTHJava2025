import org.tech.Employee;
import java.util.*;
public class EmployeeApp{
	public static void main(String[]x){
		Vector v=new Vector();
		Employee[]e=new Employee[3];
		e[0]=new Employee(1,"s",1000);
		e[1]=new Employee(2,"sh",1000);
		e[2]=new Employee(3,"shiv",1000);
		
		v.add(e[0]);
		v.add(e[1]);
		v.add(e[2]);
		
		Iterator i=v.iterator();
		while(i.hasNext()){
			Object obj=i.next();
			 Employee emp = (Employee) obj;   // correct casting

            System.out.println(
                emp.getId() + " " +
                emp.getName() + " " +
                emp.getSal()
            );
		}
		
	}
}