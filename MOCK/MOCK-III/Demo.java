/*Q6. Write a Java program to find the kth highest value from an integer array using unsorted 
array. 
Example : 
Input: Array : [15, 8, 22, 4, 10, 18]                 k = 2 
Output : 2nd highest value = 18*/
import java.util.*;
class Demo{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		int[]a={15, 8, 22, 4, 10, 18};
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		Arrays.sort(a);//4,8,10,15,18,22
		
		System.out.println("\nEnter a Value of k");
		int k=sc.nextInt();
		
		System.out.println(k+"th highest value= "+(a[a.length-k]));
		
		
	}
}