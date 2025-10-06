/*4. Merge Two Sorted Arrays (In-place)
Approach: Two Pointers from end
Example: arr1 = [1,3,5,0,0,0], arr2 = [2,4,6] → [1,2,3,4,5,6]
*/
import java.util.*;
class Merge{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many elements in array 1:");
        int n1 = sc.nextInt();
        int a[] = new int[n1];

        System.out.println("Enter array elements of array a:");
        for (int i=0; i<a.length; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter how many elements in array 2:");
        int n2 = sc.nextInt();
        int b[] = new int[n2];

        System.out.println("Enter array elements of array b:");
        for (int i = 0; i < b.length; i++)
            b[i] = sc.nextInt();

        // Ensure arrays are sorted
        Arrays.sort(a);
        Arrays.sort(b);
		
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length){
			if(a[i]<=b[j]){
				c[k]=a[i];
				i++;
				k++;
			}
			else{
				c[k]=b[j];
				j++;
				k++;
			}	
		}
		while(i<a.length){
			c[k]=a[i];
				i++;
				k++;
		}
		while(j<b.length){
			c[k]=b[j];
				j++;
				k++;
		}
			
		for(int val:c){
			System.out.print(val+" ");
		}
		
		
	}
}