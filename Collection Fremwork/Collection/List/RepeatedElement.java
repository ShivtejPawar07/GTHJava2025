/*RepeatedElement*/
import java.util.*;

class RepeatedElement {
    static int findRepeated(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        for (int val : a) {
            if (!hs.add(val)) {
                return val; // first repeated element
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {5,1,2,1,5,2,5,1,3,5,4,4};
        System.out.println("Repeated Element = " + findRepeated(a));
    }
}
