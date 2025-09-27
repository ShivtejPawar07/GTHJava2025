/*Q13. Remove Duplicate Elements from Array
Class: ArrayRemoveDuplicate
Functions:
void inputArray(int arr[])
int[] removeDuplicate()
Logic: Use nested loop, copy only unique elements to new array
*/
import java.util.*;
class Array{
	int a[];
	void setArray(int[] arr){
		a=arr;
	}
	void removeDuplicate(int[] arr){
		boolean flag=true;
		for(int i=0,j=0;j<i;i++,j++){
				if(a[i]==a[j]){
					flag=false;
					break;
				}
				if(flag)
				System.out.print(a[i]+" ");
			}
			
			
		
	}

}
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Number in an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elemnt in array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		Array am=new Array();
		am.setArray(arr);
		am.removeDuplicate(arr);
	}
}