/*14Check if two arrays are disjoint using two pointers.
Disjoint=No common element*/
import java.util.*;
class DisjointArrays {
    public static void main(String []x) {
        Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		int []b=new int[5];
		System.out.println("Enter 1st Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd Array Elemnt");
		for(int i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
		System.out.println("Display 1st Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf(a[i]+" ");
		}
		System.out.println("\nDisplay 2nd Array Elemnt");
		for(int i=0;i<b.length;i++){
			System.out.printf(b[i]+" ");
		}
        int i=0,j=0;
        boolean flag=true;
        // Use two pointers
        while (i<a.length && j<b.length) {
            if (a[i]==b[j]) {
                flag = false; // Found common element
                break;
            } else if (a[i]<b[j]) {
                i++;
            } else {
                j++;
            }
        }

        if (flag) {
            System.out.println("\nArrays are Disjoint");
        } else {
            System.out.println("\nArrays are NOT Disjoint");
        }
    }
}
