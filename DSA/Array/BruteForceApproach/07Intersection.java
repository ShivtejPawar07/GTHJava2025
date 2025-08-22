/*7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3
*/
import  java.util.*;
class Arr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int []a1=new int[5];
		int []a2=new int[5];
		System.out.println("Enter 1st Array Elemnt");
		for(int i=0;i<a1.length;i++){
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd Array Elemnt");
		for(int i=0;i<a2.length;i++){
			a2[i]=sc.nextInt();
		}
		System.out.println("Display 1st Array Elemnt");
		for(int i=0;i<a1.length;i++){
			System.out.printf(a1[i]+" ");
		}
		System.out.println("\nDisplay 2nd Array Elemnt");
		for(int i=0;i<a2.length;i++){
			System.out.printf(a2[i]+" ");
		}
		System.out.println("\nIntersection");
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a2.length;j++){
			if(a1[i]==a2[j]){
			System.out.printf(a1[i]+" ");
			break;
			}
			}
		}
	}
}