/*
3. Move All Zeros to End
Approach: Two Pointers
Example: arr = [0,1,0,3,12] → [1,3,12,0,0]

*/
import java.util.*;
class MoveZero{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many elements in array 1:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter array elements of array a:");
        for (int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
			
		Arrays.sort(a);
		
		int i=0,j=0;
		
		for(;i<n;i++){
			if(a[i]!=0){
				a[j]=a[i];
				j++;
			}		
		}
		
		while(j<n){
			a[j]=0;
			j++;
		}
		System.out.println("Enter array elements of array a:");
		for(int val:a){
			 System.out.print(val+" ");
		}
	}
}