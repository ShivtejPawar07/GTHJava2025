import java.util.*;
class  Person{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	String add;
	String cno;
	Person(){
	}
	Person(int id,String name,String add,String cno){
		this.id=id;
		this.name=name;
		this.add=add;
		this.cno=cno;
	}
	void addDetails(){
		System.out.println("Enter id,name,add,cno");
		id=sc.nextInt();
		name=sc.next();
		add=sc.next();
		cno=sc.next();
	}
	void displayDetails(){
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Add="+add);
		System.out.println("Cno="+cno);
	}
	void updateAddress(){
		System.out.println("Enter a New Address");
		String nadd=sc.next();
		System.out.println("New Address");
		System.out.println("New Address="+nadd);
	}
	void updateContact(){
		System.out.println("Enter a New Contact");
		String ncon=sc.next();
		System.out.println("New Contact");
		System.out.println("New Contact="+ncon);
	}
	void showBasicInfo(){
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Add="+add);
		System.out.println("Cno="+cno);
	}
	
}
class Student extends Person{
	String cname;
	int[] marks=new int[3];
	double per;
	Student(){
		
	}
	Student(int id,String name,String add,String cno,String cname){
		super(id,name,add,cno);
		this.cname=cname;
	}
	void enterMarks(){
		System.out.println("Accept marks of three subjects.");
		for(int i=0;i<3;i++){
			marks[i]=sc.nextInt();
		}
	}
	void calculatePercentage(){
		int sum=0;
		for(int i=0;i<3;i++){
			sum+=marks[i];
		}
		per=sum/3;
		System.out.println("Percentage="+per);
	}
	void displayDetails(){
		System.out.println("Cname="+cname);
		System.out.println("Marks="+marks[0]+" "+marks[1]+" "+marks[2]+" ");
		System.out.println("Percentage="+per);
	}

}
class Faculty extends Person{
	String sub;
	double sal;
	int exp;
	Faculty(){
		
	}
	Faculty(int id,String name,String add,String cno,String sub,double sal,int exp){
		super(id,name,add,cno);
		this.sub=sub;
		this.sal=sal;
		this.exp=exp;
	}
	void assignSubject(){
		System.out.println("Enter a sub");
		sub=sc.next();
	}
	void calculateIncrement(){
		
	}
	void displayFacultyInfo(){
		
		
	}
}

class CollegeManagement{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("1.Add Details");
		s.addDetails();
		System.out.println("2.Enter cname");
		String cname=sc.next();
		System.out.println("3.Enter marks for three subjects");
		s.enterMarks();
		System.out.println("4.Calculate and store the student’s percentage");
		s.calculatePercentage();
		System.out.println("5.Update the student’s contact number");
		s.updateContact();
		System.out.println("6.Display all details of the student");
		s.displayDetails();
		
	}
}