/*6. Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3
*/
import  java.util.*;
class Arr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		int ecnt=0,ocnt=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				ecnt++;
			}
			else if(a[i]%2!=0){
				ocnt++;
			}
		}
		System.out.printf("Even=%d\t odd=%d",ecnt,ocnt);
	}
}