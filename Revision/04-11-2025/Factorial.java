/*Q1. Write program to create class name as Factorial with two functions
       void setValue(int x): this function accept number as parameter
      int getFactorial(): this function can calculate factorial of number and return it.
*/
import java.util.*;
class Factorial{
	int x;
	void setValue(int x){
		this.x=x;
	}
	int getFactorial(){
		int fact=1;
		for(int i=1;i<=x;i++){
			fact*=i;
		}
		return fact;
	}
	public static void main(String xx[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num");
		int n=sc.nextInt();
		Factorial f=new Factorial();
		f.setValue(n);
		System.out.println("Factorial="+f.getFactorial());
		
	}
}