/*Union*/
import java.util.*;
class Union {
    static void union(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();
        // add elements of first array
        for (int i : a) {
            hs.add(i);
        }
        // add elements of second array
        for (int i : b) {
            hs.add(i);
        }
        System.out.print("Union Elements = ");
        for (int i : hs) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,2,4};
        int[] b = {4, 5, 6, 7};

        union(a, b);
    }
}
