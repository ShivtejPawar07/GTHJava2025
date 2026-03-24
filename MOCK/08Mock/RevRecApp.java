/*Q2. Write a program to reverse an array using recursion. 
Input: 
Array: 
10 20 30 40 50 
Output: 
Reversed Array: 
50 40 30 20 10 */

class RevRecApp {

    static void rev(int[] a, int start, int end) {
        // Base condition
        if (start >= end)
            return;

        // Swap elements
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        // Recursive call
        rev(a, start + 1, end - 1);
    }

    public static void main(String[] x) {
        int[] a = {10, 20, 30, 40, 50};

        // Call recursion
        rev(a, 0, a.length - 1);

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}