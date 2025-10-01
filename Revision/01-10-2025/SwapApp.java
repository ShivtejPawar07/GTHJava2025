/*1. Write a program to input two values using command line argument and perform its swapping?*/
class Swap{
	public static void swapping(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.printf("\nNumber After Swapping\n a=%d\tb=%d",a,b);
	}
}
class SwapApp{
	public static void main(String x[]){
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		System.out.printf("Number before Swapping\n a=%d\tb=%d\n",a,b);
	
		Swap.swapping(a,b);
	}
}
