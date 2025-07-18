/*Q20. Write a Java program and compute the sum of an integer's digits.

Input : 123

Output : 6*/
public class SumOfDigit  {
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the four digit num");
	int n=sc.nextInt();
	int sum=(n%10)+((n/10)%10)+((n/100)%10)+(n/1000);
	System.out.println(sum);
	}
}