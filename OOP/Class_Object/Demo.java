import java.util.*;
class EvenOdd{
	void isEven(int n){
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		EvenOdd e=new EvenOdd();
		e.isEven(n);
	}
	
}