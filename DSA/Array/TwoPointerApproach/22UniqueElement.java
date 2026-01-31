/*UniqueElementsTwoPointer*/
import java.util.*;

class UniqueElementsTwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        System.out.println("\nUnique elements:");
        for (int i = 0; i < n; i++) {
            // Check left and right
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == n - 1 || arr[i] != arr[i + 1])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
/*
static int unique(int[] a) {
        int res = 0;
        for (int val : a) {
            res ^= val;
        }
        return res;
    }

    public static void main(String[] x) {
        int[] a = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("Unique Element = " + unique(a));
    }
*/
/*
🧠 Example

Sorted array:

[2, 2, 3, 5, 5, 7]


Check each index:

i	arr[i]	Left same?	Right same?	Unique?
0	2		No left		same right	❌
1	2		same left	No			❌
2	3	arr[2] != arr[1]	arr[2] != arr[3]	✅
3	5	arr[3] != arr[2]	same right	❌
4	5	same left		arr[4] != arr[5]	❌
5	7	arr[5] != arr[4]	No right	✅
*/
