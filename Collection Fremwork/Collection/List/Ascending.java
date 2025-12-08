/*Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/
import java.util.*;
class Ascending {
    public static void main(String[] x) {

        // 1. Create ArrayList and add elements
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(2);
        al.add(1);
        al.add(3);

        System.out.println("ArrayList: " + al);

        // 2. Convert ArrayList -> Vector
        Vector<Integer> v = new Vector<>();
        for (int n : al) {
            v.add(n);
        }

        System.out.println("Vector before sorting: " + v);

        // 3. Manual sorting (Bubble Sort)
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {

                // If current element is bigger than next -> swap
                if (v.get(i) > v.get(j)) {
                    int temp = v.get(i);
                    v.set(i, v.get(j));
                    v.set(j, temp);
                }
            }
        }
        System.out.println("Vector after sorting (Ascending): " + v);
    }
}
