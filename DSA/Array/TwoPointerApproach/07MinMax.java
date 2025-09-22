/*7.Find the maximum and minimum elements in an array using two pointers.*/
import java.util.*;

class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements in array:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Display Array Elements:");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }

        // Two-pointer approach
        int i = 0, j = n - 1;
        int max = a[0], min = a[0];

        while (i <= j) {
            if (a[i] > a[j]) {
                if (a[i] > max) 
					max = a[i];
                if (a[j] < min) 
					min = a[j];
            } else {
                if (a[j] > max)
					max = a[j];
                if (a[i] < min) 
					min = a[i];
            }
            i++;
            j--;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}

