/*3. Merge two sorted arrays into one sorted array using two pointers.*/

import java.util.*;
class MergeSorted {
    public static void main(String x[]) {
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

        int c[] = new int[n1 + n2];
        int i=0, j=0, k=0;

        // Merge using two pointers
        while (i<n1 && j<n2) {
            if (a[i] <= b[j]) {
                c[k]=a[i];
				k++;
				i++;
            } else {
                c[k]=b[j];
				k++;
				j++;
            }
        }

        // Copy remaining elements of a[]
        while (i<n1) {
            c[k]=a[i];
			k++;
			i++;
        }

        // Copy remaining elements of b[]
        while (j<n2) {
            c[k]=b[j];
			k++;
			j++;
        }
		
        System.out.println("Merged array:");
         for (i=0; i<c.length; i++) {
			 if(c[i]>0){
            System.out.print(c[i] + " ");
			 }
        }
    }
}
