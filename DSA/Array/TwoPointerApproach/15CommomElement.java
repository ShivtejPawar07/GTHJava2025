/*15.Find the common elements in three sorted arrays using two pointers*/
import java.util.*;
class Array {
    public static void main(String []x) {
        Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		int []b=new int[5];
		int []c=new int[5];
		System.out.println("Enter 1st Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd Array Elemnt");
		for(int i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
		System.out.println("Enter 3rd Array Elemnt");
		for(int i=0;i<c.length;i++){
			c[i]=sc.nextInt();
		}
		System.out.println("Display 1st Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf(a[i]+" ");
		}
		System.out.println("\nDisplay 2nd Array Elemnt");
		for(int i=0;i<b.length;i++){
			System.out.printf(b[i]+" ");
		}
		System.out.println("\nDisplay 3rd Array Elemnt");
		for(int i=0;i<b.length;i++){
			System.out.printf(c[i]+" ");
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		 int i = 0, j = 0, k = 0; // three pointers

        System.out.print("Common elements: ");
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.print(a[i] + " ");
                i++; j++; k++;  // move all three
            } 
            else if (a[i] < b[j]) {
                i++;  // move smallest pointer
            } 
            else if (b[j] < c[k]) {
                j++;
            } 
            else {
                k++;
            }
        }
	}
}