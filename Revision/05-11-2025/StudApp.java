/*Q.8Create a base class Student with a constructor Student(String name, int marks) to store values.
 Create a child class Result that extends Student and has function getGrade() which returns:
"A Grade" if marks ≥ 75
"B Grade" if marks ≥ 50
"Fail" otherwise.
*/
class Student{
	String name;
	int marks;
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
}
class Result extends Student{
	Result(String name, int marks){
		super(name,marks);
	}
	String getGrade(){
		if(marks>=75)
			return "A Grade";
		else if(marks>=50)
			return "B Grade";
		else
			return "Fail";
	}
}
class StudApp{
	public static void main(String[]x){
		Result r=new Result("s",100);
		System.out.println(r.getGrade());
		
	}
}