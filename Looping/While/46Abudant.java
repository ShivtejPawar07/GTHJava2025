/*Q46. Write a Java program to find all Abundant numbers up to n.
An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.

Explanation:
 Use nested loops: outer for numbers from 1 to n; inner for finding proper divisors and summing them.
 Compare sum with the number.*/
 import java.util.*;
 class Abundant{
   public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number");
	 int limit=sc.nextInt();
	 int n=1;
	 while(n<=limit){
	 int i=1,sum=0;
	 while(i<=n/2){
	   if(n%i==0){
	     sum+=i;
	   }
	   i++;
	   
	   
	 }
	 if(sum>n)
	   System.out.print(n+" ");
   n++;
	 }
   }
 }