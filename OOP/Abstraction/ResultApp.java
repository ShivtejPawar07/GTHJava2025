/*Q2. Create an abstract class Exam with subject marks as fields.
 Use a constructor to initialize marks and an abstract method evaluateResult() that returns “Pass” or “Fail”.
Create a class StudentResult that extends Exam and:
Pass condition: All subjects >= 40 and average >= 50.
Task:
Use the constructor to initialize marks and call evaluateResult() to print the result of the student.*/

abstract class Exam{
	int[]m;
	Exam(int[]m){
		this.m=m;
	}
	abstract String evaluateResult();
}
class StudentResult extends Exam{
	StudentResult(int[]m){
		super(m);
	}
	String evaluateResult(){
		int sum=0;
		for(int i=0;i<m.length;i++){
			sum+=m[i];
		}
		double avg=sum/m.length;
		
		if(sum>=40 && avg >=50) return "Pass";
		else return "Falil";
	}
}
class ResultApp{
	public static void main(String[]x){
		int[] m={90,20,30,40,50,60,70,90};
		
		Exam e=new StudentResult(m);
		System.out.print(e.evaluateResult());
	}
}
