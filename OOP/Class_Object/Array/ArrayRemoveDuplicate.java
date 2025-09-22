/*Q13. Remove Duplicate Elements from Array
Class: ArrayRemoveDuplicate
Functions:
void inputArray(int arr[])
int[] removeDuplicate()
Logic: Use nested loop, copy only unique elements to new array
*/
import java.util.*;
class Array{
	void inputArray(int arr[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elemnt");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	}
	int[] removeDuplicate(int a[]){
		  int[] temp = new int[a.length];  // temporary array for unique elements
        int k = 0;                // index for temp[]
		for(int i=0;i<a.length;i++){//10 20 10 30 30
			boolean flag=true;
			for(int j=0;j<i;j++){
				         //
				  if((a[i]==a[j]))// 
				  { 
			        flag=false;
				    break;
				  }
			}
			if(flag)
               temp[k++] = a[i]; // store only unique element

		}
		// Create new array of size k (unique count)
		int[] unique = new int[k];
        for (int i = 0; i < k; i++) {
            unique[i] = temp[i];
        }

        return unique;
	}
}
class ArrayRemoveDuplicate{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		Array am=new Array();
		am.inputArray(arr);
		
		int []ar=am.removeDuplicate(arr);
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}
}