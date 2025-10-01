import com.tot.Student;
import com.tot.Collage;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[]s=new Student[3];
		Collage co=new Collage();
		co.accept(s);
		int ch=0;
		do {
			System.out.println("1. Add Student Details.");
			System.out.println("2. Show All Student Details.");
			System.out.println("3. Search Student");
			System.out.println("   1. Id");
			System.out.println("   2. Name");
			System.out.println("4. Delete Student .");
			System.out.println("   1. Email");
			System.out.println("   2. Failed( marks<40.");
			System.out.println("5. Update Student");
			System.out.println("   1. Update Student Course By Id..");
			System.out.println("   2. Update Student Contact By Name.");
			System.out.println("6. Sort Products:");
			System.out.println("   1. By id ascending.");
			System.out.println("   2. By marks descending");
			System.out.println("7. Display Topper (Highest Marks).");
			System.out.println("8. Display Students With Marks Between 50 and 80.");
			System.out.println("9. Exit.");


			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch) {
				case 1: co.addStudent();
			     	break;

				case 2: co.displayStud();
				    break;
		
				case 3: co.searchStudent();
				    break;
		
				case 4: co.deleteStudent();
				    break;
		
				case 5: co.updateStudentByIdOrName();
				    break;
		
				case 6: co.sortStudents();
				    break;
		
				case 7: co.displayTopper();
				    break;
		
				case 8: co.displayStudentsInRange();
				    break;
		
				case 9: System.out.println("Exiting...");
				    break;

				default:System.out.println("Invalid choice");
					break;	
				
					
				
			}
		}while(ch!=9);
	}
}
