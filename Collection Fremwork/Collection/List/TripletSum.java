/*2. 5. Sum
Description:
Find all unique triplets (a,b,c) such that a+b+c = 0 using sorting and ArrayList.
Example:
Input: [-1,0,1,2,-1,-4]
Output: [[-1,-1,2], [-1,0,1]]

*/
import java.util.*;

class TripletSumCollection {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(-1);
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(-1);
        al.add(-4);

        int n = al.size();

        // duplicates हटवण्यासाठी Set
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    int a = hs.get(i);
                    int b = hs.get(j);
                    int c = hs.get(k);

                    if (a + b + c == 0) {

              
                            System.out.println("(" + a + ", " + b + ", " + c + ")");
                        
                    }
                }
            }
        }
    }
}
