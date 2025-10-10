//5.Write a program to print the first n Fibonacci numbers using recursion.
import java.util.*;
public class Fibo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number in Fibonacci Series");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) //0 1 1 2 3 5
		System.out.print(fibo(i)+" "); //fibo(0) (1) (2) (3)
	}
	public static int fibo(int i)
	{
		if(i <= 1) 
			return i; //0 1
		
		return fibo(i-1) + fibo(i-2); //fibo(1)=1 + fibo(0)=0 =>1
									  //fibo(2)=1 + fibo(1)=1 =>2
									  //fibo(3)=2 + fibo(2)=1 =>3
	}
}
