/*5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.


For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.
*/
class Staff {
    String name;
	int sal;
	void setDatails(String name,int sal){
		this.name=name;
		this.sal=sal;
	}

    void incrementSalary() {
        // To be overridden by subclasses
    }
}

class TeachingStaff extends Staff {
    @Override
    void incrementSalary(){
        double tsal = sal+ sal * 0.15;
        System.out.println("Name="+name);
		System.out.println("sal="+sal);
        System.out.println("Total Sal: " + tsal );
        System.out.println();
    }
}

class NonTeachingStaff extends Staff {
    @Override
    void incrementSalary() {
        double tsal = sal+ sal * 0.10;
        System.out.println("Name="+name);
		System.out.println("sal="+sal);
        System.out.println("Total Sal: " + tsal );
        System.out.println();
    }
}

public class StaffApp {
    public static void main(String[] args) {
        TeachingStaff ts = new TeachingStaff();
        ts.setDatails("Shivtej Dipak Pawar", 10000);
        ts.incrementSalary();

        NonTeachingStaff nts = new NonTeachingStaff();
        nts.setDatails("Shiv Pawar", 20000);
        nts.incrementSalary();
    }
}
