/*MergeArray*/
class MergeArray {
    public static void main(String[] args) {
        int first[] = {1, 2, 3, 4, 5};
        int second[] = {6, 7, 8, 9, 10};

        System.out.print("First Array: ");
        for (int x : first) System.out.print(x + " ");
        System.out.println();

        System.out.print("Second Array: ");
        for (int x : second) System.out.print(x + " ");
        System.out.println();

        System.out.print("Output: ");

        int n = first.length;
        int m = second.length;

        // Merge in the pattern (first[i], second[m-1-i])
        for (int i = 0; i < n; i++) {
            System.out.print(first[i]);
            System.out.print(second[m - 1 - i]);
        }
    }
}