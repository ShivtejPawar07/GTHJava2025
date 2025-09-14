//5.Write a program to print the first n Fibonacci numbers using recursion.
public class Fibo{
	public static void main(String x[]){
		for(int i=0;i<6;i++) //0 1 1 2 3 5
		System.out.print(fibo(i)+" "); //fibo(0) (1) (2) (3)
	}
	public static int fibo(int n)
	{
		if(n <= 1) 
			return n; //0 1 1
		
		return fibo(n-1) + fibo(n-2); //fibo(1)=1 + fibo(0)=0 =>1
									  //fibo(2)=2 + fibo(1)=1 =>3
	}
}

/*
public class Fibo{
	public static void main(String x[]){
		Logic l = new Logic();
		for(int i=0;i<6;i++) //0 1 1 2 3 5
		System.out.print(l.fibo(i)+" "); //fibo(0) (1) (2) (3)
	}
}
public class Logic{
	public static int fibo(int n)
	{
		if(n <= 1) 
			return n; //0 1 1
		
		return fibo(n-1) + fibo(n-2); //fibo(1)=1 + fibo(0)=0 =>1
									  //fibo(2)=2 + fibo(1)=1 =>3
	}
}*/