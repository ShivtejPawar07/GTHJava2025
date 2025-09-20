import java.util.*;

class UnionIntersection {
    public static void main(String xx[]) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.println("Enter how many elements in array 1:");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter array elements of array a:");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

        // Input second array
        System.out.println("Enter how many elements in array 2:");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter array elements of array b:");
        for (int i = 0; i < b.length; i++)
            b[i] = sc.nextInt();

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // ---------------- UNION ----------------
        System.out.println("Union of arrays:");
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (b[j] < a[i]) {
                System.out.print(b[j] + " ");
                j++;
            } else { // equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        // Print remaining elements
        while (i < a.length) {
            System.out.print(a[i] + " ");
            i++;
        }
        while (j < b.length) {
            System.out.print(b[j] + " ");
            j++;
        }

        // ---------------- INTERSECTION ----------------
        System.out.println("\nIntersection of arrays:");
        i = 0; j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else { // equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }
}
