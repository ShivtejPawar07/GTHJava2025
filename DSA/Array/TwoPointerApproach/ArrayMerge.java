/*Q9. Merge Two Arrays
Class: ArrayMerge
Functions:
void inputArray(int arr1[], int arr2[])
int[] mergeArrays()
Logic: Create new array of size arr1.length + arr2.length and copy both arrays into it.
*/
import java.util.*;
class Array{
	void inputArray(int arr1[],int arr2[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array elemnt");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd array elemnt");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
	}
	int[] mergeArrays(int a[],int b[]){
		int[] c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(a[i]<=b[j]){
				c[k]=a[i];
				k++;
				i++;
			}
			else{
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length){
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<arr2.length){
			c[k]=a[j];
			k++;
			j++;
		}
		return c;
	}
}
class ArrayMerge{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an 1st array");
		int n1=sc.nextInt();
		System.out.println("How many elemnt in an 2nd array");
		int n2=sc.nextInt();
		
		int[]arr1=new int[n1];
		int[]arr2=new int[n2];
		
		
		Array am=new Array();
		am.inputArray(arr1,arr2);
		
		int c[]=am.mergeArrays(int arr1[],int arr2[])
		
		System.out.println("DIsplay merge arry");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
	}
}