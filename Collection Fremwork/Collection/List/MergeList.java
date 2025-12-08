/*Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/
import java.util.*;

class Merge {
    public static void main(String[] x) {

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        // Sample values
        al1.add(1);
        al1.add(2);
        al1.add(3);

        al2.add(2);
        al2.add(3);
        al2.add(4);

        ArrayList<Integer> result = new ArrayList<>();

        // Add from first list
        for (int n : al1) {                        
            if (!result.contains(n)) {
                result.add(n);
            }
        }

        // Add from second list
        for (int n : al2) {
            if (!result.contains(n)) {
                result.add(n);
            }
        }

        System.out.println("Merged list without duplicates: " + result);
    }
}
/*if (!result.contains(n))

contains() checks if the value already exists in result

! means "not"

So this means:
✔ If result does NOT have the number → add it
❌ If it already exists → do not add
*/