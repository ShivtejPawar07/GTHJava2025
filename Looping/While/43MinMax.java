/*Q43. Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min.
*/
import java.util.*;
class SmLarg{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	//int min=n%10,max=0;
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	
	while(n!=0){//123    
	 int rem=n%10; //3   //2  //1  
	  
	   if(rem>max){//3>0  //2>0  //1>0
	   max=rem;//max=3    //2    //1
	  }
	  
	  if(rem<min){//3<9  //2<9   1<9
	   min=rem;//min=9   //2      1
	  }
	 
	 n=n/10;//12 1
	}
	System.out.println("max:"+max);
	System.out.println("min:"+min);
  
  }
}