import java.util.*;

class RemoveDuplicate {
    public static void main(String[] x) {

        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(3);
        v.add(2);
        v.add(11);

        Vector<Integer> result = new Vector<>();

        for (int i = 0; i < v.size(); i++) {
            int element = v.get(i);

            // add only if not already present
            if (!result.contains(element)) {
                result.add(element);
            }
        }

        System.out.println("Original Vector : " + v);
        System.out.println("After Removing Duplicates : " + result);
    }
}