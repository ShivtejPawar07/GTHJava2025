/*Unique Elelmnt*/
class Unique {
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
}
/*
import java.util.*;

class AllUnique {
    public static void main(String[] args) {

        int[] a = {5, 1, 5, 2, 5, 3, 5, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Step 2: Print all unique elements
        System.out.print("All Unique Elements: ");
        for (int i : a) {
            if (map.get(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

*/