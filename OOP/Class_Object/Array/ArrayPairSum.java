/*Q14. Find Pair of Elements with Given Sum
Class: ArrayPairSum
Functions:
void inputArray(int arr[])
void findPairs(int target)
Logic: Check all pairs (i, j) where arr[i] + arr[j] == target.
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
	void findPairs(int arr[], int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found with sum = " + target);
        }
    }
}

class ArrayPairSum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element in an array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		Array am=new Array();
		am.inputArray(arr);
		System.out.println("enter target sum");
		int t=sc.nextInt();
		am.findPairs(arr,t);
	}
}
