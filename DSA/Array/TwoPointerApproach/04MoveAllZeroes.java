/*4.Move all zeroes to the end of the array using two pointers.*/
//1 0 3 2 0 0 2==1 3 2 0 0 0 
import java.util.*;
class Zero{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element in an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int i = 0;  // pointer for non-zero placement
        int j = 0;  // properly declared

        // Move non-zero elements forward
        while (i < n) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
            i++;
        }
        // Fill the rest with zeros
        while (j < n) {
            a[j] = 0;
            j++;
        }
		System.out.println("Display Array");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}