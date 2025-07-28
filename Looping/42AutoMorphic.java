/*Q42. Write a Java program to print all automorphic numbers between 1 and n. 
An automorphic number’s square ends with the number itself (e.g., 5² = 25).
 Explanation:
 Use loop to check square and a while loop to match last digits.
*/
import java.util.*;
class AutoMorphic{
   public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number")
	 int n=sc.nextInt();
	 int i=1,sq;
	 while(i<=n){
		 
	  sq=i*i;
	 
	   int rem=sq%10;
	   if(rem==i){
	     System.out.println(i);
        		 
	   }
	 
	 i++;
   }
}
}

