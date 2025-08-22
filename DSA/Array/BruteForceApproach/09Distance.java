/*Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
*/
import  java.util.*;
class Distance{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Array Elemnt");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		int cnt=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]-a[j]==5){
				System.out.print("("+a[i]+","+a[j]+")\t");
				cnt++;
				}
			}
		}
		System.out.println("\nNumber of inversion:"+cnt);
	}
}